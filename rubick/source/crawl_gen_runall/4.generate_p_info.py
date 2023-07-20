#!/usr/bin/python
# -*- coding: UTF-8 -*-
"""
-------------------------------------------------
@File    : get_package_name.py
@Time    : 23/2/22 9:57 PM
@Author  : Han0nly
@Github  : https://github.com/Han0nly
@Email   : zhangxh@stu.xidian.edu.cn
-------------------------------------------------
"""
import argparse
import json
import os
import glob

import re
import pylcs

"""
# 首先排除test/
# 然后把剩下的文件名删掉
# 然后搜索src/main/java/或者src/main/或者src/把这些字符串删掉
# 剩下的匹配最大公共子串
"""

from difflib import SequenceMatcher


def longest_substring(str1, str2):
    seq_match = SequenceMatcher(None, str1, str2)
    # find match of longest sub-string
    # output will be like Match(a=0, b=0, size=5)
    match = seq_match.find_longest_match(0, len(str1), 0, len(str2))
    # print longest substring
    if match.size != 0:
        #print(str1[match.a: match.a + match.size])
        return str1[match.a: match.a + match.size]
    else:
        print('No longest common sub-string found')
        return None


def get_common_str(file_list, asre):
    one_list = []
    for file in file_list:
        if ('test/' in file) or ('Test/' in file):
            continue

        i = file.rfind("/")
        dir_str = file[:i]
        position = dir_str.find("src/main/java/")
        if position != -1:
            # print("Found src/main/java/ in", dir_str)
            clean_str = dir_str[position:].replace("src/main/java/", "")
            # print("After clean, ", clean_str)
            one_list.append(clean_str)
            #print(clean_str)
        elif dir_str.find("src/main/") != -1:
            position = dir_str.find("src/main/")
            clean_str = dir_str[position:].replace("src/main/", "")
            #print(clean_str)
            one_list.append(clean_str)
        elif dir_str.find("src/") != -1:
            position = dir_str.find("src/")
            clean_str = dir_str[position:].replace("src/", "")
            #print(clean_str)
            one_list.append(clean_str)
        else:
            one_list.append(dir_str)

    #print('one_list')
    #print(one_list)
    f_list = [ f for f in one_list if asre.match(f) == None ]
    #print('f_list')
    #print(f_list)

    if len(f_list) != 0:
        # print(f_list)
        iter_common_str = f_list[0]
        for i in range(1, len(f_list)):
            match = longest_substring(iter_common_str, f_list[i])
            if match:
                iter_common_str = match
        #print("The longest common string is %s" % (iter_common_str))
        return iter_common_str
    else:
        return None


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='This script is used to generate possible parameters used in program '
                                                 'analysis ')
    parser.add_argument("-m", "--matchinfo", help="The match information (out json of step 2) ",
                        required=True, type=str)
    parser.add_argument("-a", "--attacksurface", help="The string pattern of the attack surface.",
                        required=True, type=str)
    parser.add_argument("-t", "--targetapiclass", help="The string pattern of the target api class.",
                        required=True, type=str)
    # parser.add_argument("-o", "--out", help="The location to store the extracted files")
    args = parser.parse_args()

    results = None
    with open(args.matchinfo, "r") as f:
        # we only use the matched file information to infer common str (-p)
        results = json.load(f)

    asre = re.compile(args.attacksurface)
    apire = re.compile(args.targetapiclass)
    outdir_base = os.path.abspath( os.path.dirname(args.matchinfo) )
    with open(os.path.join(outdir_base, 'possible_entry'), 'w') as entry_file:
        for repo_name, repo_info in results["repos"].items():
            # -p 
            #print('repo_info', repo_info['files'])
            common_str = get_common_str(repo_info["files"], asre)
            if (common_str == None) or (common_str == ''):
                #raise Exception('when will this happen? %s => %s ' % (outdir_base, repo_name))
                #print('!!! ERROR: common_str is None or "", investigate this')
                continue

            if common_str.endswith('/'):
                common_str = common_str[:-1]

            if common_str.replace('/','').strip() == '':
                print('common_str result is wierd "%s", skip this, investigate this later' % (common_str))
                for f in repo_info['files']:
                    print('    => %s' % (f))
                continue
            
            if apire.match( common_str.replace('/', '.') ) != None:
                # the common_str is part of the apire
                # this means that this repo integrates the source of the target api
                # skip this
                continue

            author_plus_repo = None
            if repo_name.startswith('github.com'):
                # remove the github.com/
                author_plus_repo = repo_name.split("/", 1)[-1]
            else:
                raise Exception('TODO: should add code to handle non github repo')
            
            # if not exist, it will find nothing
            path_pattern = os.path.join(outdir_base, 'jars_unzip', author_plus_repo, '**', common_str)
            #print('author_plus_repo ', author_plus_repo)
            #print('common_str ', common_str)
            #print('path_pattern ', path_pattern)
            for f in glob.glob(path_pattern, recursive = True):
                #print("@@@@", f)
                # remove the common_str
                jpath = f[:-1 * len(common_str)]
                if jpath == '':
                    print("ERROR: jpath is null, before is '%s'" % (f))
                    print('outdir_base ', outdir_base)
                    print('author_plus_repo ', author_plus_repo)
                    print('common_str ', common_str)
                    print('path_pattern ', path_pattern)
                    for f in repo_info['files']:
                        print('    => %s' % (f))

                # write options for one run
                entry_file.write("# Repo: " + repo_name + "\n")
                entry_file.write(
                        "# -j: '" + jpath + "'\n")
                entry_file.write(
                        "# -o: '" + os.path.join(outdir_base, 'extracted') + "'\n")
                entry_file.write("# -e: '.*'\n")
                entry_file.write("# -t: '" + args.targetapiclass + "'\n")
                # # File
                for file_name in repo_info["files"]:
                    entry_file.write("# File: " + file_name + "\n")
                # value of -p
                entry_file.write(common_str.replace("/", "\\.") + ".*" + "\n")

"""

# 1 attack surface => X repos
# 1 repo => X jar

# 1 attack surface => 1 -e , 1 -t
# 1 repo => 1 -p
# 1 jar => X -j, X -o

bash run.sh ex \
    -j 'jars/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies' \
    -p 'technology\.tabula.*' \
    -e '.*' \
    -t 'org\.apache\.pdfbox\.pdmodel\.PDDocument.*' \
    -o 'extracted/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies'
"""
