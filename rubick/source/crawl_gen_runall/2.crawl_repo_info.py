import argparse
import json
import os
import datetime
import xml.etree.ElementTree as ET
import requests
from retrying import retry
from ipdb import launch_ipdb_on_exception
import time
import subprocess
from ratelimit import limits, sleep_and_retry

ACCESS_TOKEN = 'XXXXXYOURTOKENXXXXX'
headers = {'Authorization': 'token ' + ACCESS_TOKEN}
# sourcegraph_results_dir = "./src_results"
# jar_dir = "./jars"
# final_json = {}

"""
{
    "pattern":"",
    "repos":
        {
            repo_id1: {
                files: [],
                stars: "",
                releases: ["link1","link2"],
            }
            repo_id2: {
                files: [],
                stars: "",
                releases: ["link1","link2"],
            }
        }
}
"""

# "Authorization: token OAUTH-TOKEN"

max_retry = 10


def find_maven_id_and_download(repoid, download_path):
    output = subprocess.check_output("src search -json \'repo:" + "^github\.com/" + repoid + "$ file:^pom\.xml\'",
                                     shell=True)
    result = json.loads(output.decode("utf-8"))
    min_depth_path = ""
    group_id = ""
    artifact_id = ""
    min_depth = 100
    if result['ResultCount'] > 0:
        print("[DEBUG] Found pom.xml in Repo %s, finding jars on maven central repo" % (repoid))
        for pom in result["Results"]:
            content = pom["file"]["content"]
            path = pom["file"]["path"]
            # print(content)
            root = ET.fromstring(content)
            namespaces = {'xmlns': 'http://maven.apache.org/POM/4.0.0'}
            groupIds = root.findall("./xmlns:groupId", namespaces=namespaces)
            artifactIds = root.findall("./xmlns:artifactId", namespaces=namespaces)
            if len(groupIds) and len(artifactIds):
                if path.count("/") < min_depth:
                    min_depth = path.count("/")
                    min_depth_path = path
                    group_id = root.find("./xmlns:groupId", namespaces=namespaces).text
                    artifact_id = root.find("./xmlns:artifactId", namespaces=namespaces).text
                    # poms[path] = {"groupId": group_id, "artifactId": artifact_id}
            else:
                print("[DEBUG] Irregular pom.xml format %s" % repoid)
                continue
        if min_depth_path:
            repoid = group_id + "/" + artifact_id
            print("[DEBUG] The shortest path is %s, searching in maven..." % repoid)
            download_from_maven(repoid, download_path)
    else:
        print("[DEBUG] No pom.xml in this repo (%s)." % repoid)


def download_from_github(repoid, download_path):
    has_jar = False
    while True:
        try:
            response = requests.get(
                "https://api.github.com/repos/" + repoid + "/releases/latest",
                headers=headers)
            release_response = response.json()
            releases = []
            publish_time = ""
            if "message" not in release_response.keys():
                assets = release_response["assets"]
                for asset in assets:
                    releases.append(asset["browser_download_url"])
                    if asset["browser_download_url"].split('.')[-1] in (
                            "jar", "JAR", "ear", "EAR", "aar", "AAR"):
                        print("[DEBUG] Found testable artifacts %s from Github" % asset[
                            "browser_download_url"])
                        file_path = os.path.join(download_path, asset["browser_download_url"].split("/")[-1])
                        os.makedirs(download_path, exist_ok=True)
                        if not os.path.exists(file_path):
                            retry = 0
                            while retry < max_retry:
                                try:
                                    file_data = requests.get(asset["browser_download_url"]).content
                                    with open(file_path, "wb") as file:
                                        file.write(file_data)
                                    has_jar = True
                                    print("[DEBUG] Download %s successfully" % asset["browser_download_url"])
                                    break
                                except Exception as e:
                                    print("[DEBUG] Download %s failed, Error: %s" % (asset["browser_download_url"], e))
                                    retry = retry + 1
                                    time.sleep(3)
                        else:
                            has_jar = True
                            print("[DEBUG] %s already exist, Skipping" % (asset["browser_download_url"]))
                            continue
                publish_time = release_response["published_at"]
                time.sleep(0.72)
                return releases, publish_time, has_jar
            elif release_response["message"] == "Not Found":
                print("[DEBUG] Repo %s is not found on Github" % repoid)
                return releases, publish_time, has_jar
        except requests.exceptions.ConnectionError as e:
            print(e)
            time.sleep(3)
            continue


def unix2Date(unixTime):
    unixTime = int(str(unixTime)[:-3])
    return datetime.datetime.fromtimestamp(unixTime).strftime('%d.%m.%Y')


def download_from_maven(repoid, download_path):
    try:
        group_id = repoid.split("/")[0]
        artefact_id = repoid.split("/")[1]
        mvnSearchURL = "http://search.maven.org/solrsearch/select?q=g:%22" + group_id + "%22+AND+a:%22" + artefact_id + "%22&rows=100&core=gav"
        # print("[DEBUG] Secrch URL:", mvnSearchURL)
        response = requests.get(mvnSearchURL)
        data = response.json()
        numberOfVersions = data["response"]["numFound"]
        releases = []
        publish_time = ""
        if numberOfVersions > 0:
            version = data["response"]["docs"][0]['v']
            file_type = data["response"]["docs"][0]['p']
            if file_type != "jar" or file_type != "aar":
                print("[DEBUG] The file type in maven central repo is [%s] (not jar/aar), skipping..." % file_type)
                return releases, publish_time
            fileName = artefact_id + "-" + version + "." + file_type
            file_full_path = os.path.join(download_path, fileName)
            repoURL = "http://search.maven.org/remotecontent?filepath="
            # retrieve and save file
            URL = repoURL + group_id + "/" + artefact_id + "/" + version + "/" + fileName
            print("[DEBUG] Found testable artifacts %s from Maven Central Repo" % URL)
            os.makedirs(download_path, exist_ok=True)
            if not os.path.exists(file_full_path):
                while True:
                    try:
                        file_data = requests.get(URL).content
                        with open(file_full_path, "wb") as file:
                            file.write(file_data)
                        print("[DEBUG] Download %s successfully" % URL)
                        break
                    except Exception as e:
                        print("[DEBUG] Download %s failed, Error: %s" % (URL, e))
                        time.sleep(3)
            else:
                print("[DEBUG] %s already exist, Skipping" % URL)
            publish_time = unix2Date(data["response"]["docs"][0]['timestamp'])
            releases.append(URL)
            return releases, publish_time
        else:
            print("[DEBUG] Cannot Found testable artifacts %s from Maven Central Repo" % repoid)
            return releases, publish_time
    except Exception as excp:
        print('[DEBUG] Could not retrieve meta data for ' + repoid + '  [SKIP]  (' + str(excp) + '), retrying...')


""" 
jsonfile: 是attack surface的sourcegraph文件的文件路径
"""


def target_info_extract(jsonfile):
    with open(jsonfile, "r") as f:
        search_result = json.load(f)['data']['search']['results']
        final_json = {"repos": {}}
        if search_result['resultCount'] != 0:
            print("--------------------")
            count = 1
            for result in search_result["results"]:
                repo_id = result['repository']['name']
                print("[DEBUG] Analyzing repo %s(%d/%d)" % (repo_id, count, len(search_result["results"])))
                count = count + 1
                if repo_id not in final_json["repos"].keys():
                    repo_stars = result['repository']['stars']
                    source = repo_id.split("/", 1)[0]
                    repo_id_exclude_source = repo_id.split("/", 1)[1]
                    path = os.path.join(jsonfile[:jsonfile.rfind(os.path.sep)], "jars")
                    path = os.path.join(path, repo_id.split("/", 1)[-1])
                    if source == "github.com":
                        (releases, publish_time, has_jar) = download_from_github(repo_id_exclude_source, path)
                        if not has_jar:
                            # repo_id
                            print("[DEBUG] Cannot find jars on github. Looking for jars in maven...", repo_id)
                            find_maven_id_and_download(repo_id_exclude_source, path)
                            # os.system("src search -json \'repo:^github\.com/apache/sanselan$ file:^pom\.xml\'")
                            # pass
                    elif source == "maven":
                        (releases, publish_time) = download_from_maven(repo_id_exclude_source, path)
                    else:
                        print("[DEBUG] Unknown Repo Source: ", repo_id)
                    repo_info = {
                        "files": [result['file']['path']],
                        "stars": repo_stars,
                        "releases": releases,
                        "release_published_at": publish_time
                    }
                    final_json["repos"][repo_id] = repo_info
                else:
                    final_json["repos"][repo_id]["files"].append(result['file']['path'])
            print("----------------------")
            return final_json


def main():
    parser = argparse.ArgumentParser(description='This script is used to analyze the Sourcegraph code search result '
                                                 'and download all the available jar format releases')
    parser.add_argument("-s", "--srcjson", help="The location of json format Sourcegraph code search result file.",
                        required=True, type=str)
    # parser.add_argument("-o", "--out", help="The location to store the downloaded jars")
    args = parser.parse_args()
    release_info = target_info_extract(args.srcjson)
    # print(release_info)
    # with open("targets", "r") as tf:
    #     for line in tf:
    #     target_info_extract(line.strip())
    with open(os.path.join(args.srcjson[:args.srcjson.rfind(os.path.sep)], "release_info.json"), "w") as rf:
        json.dump(release_info, rf, indent=4)
    # download_tars()


if __name__ == '__main__':
    # with launch_ipdb_on_exception():
    main()
