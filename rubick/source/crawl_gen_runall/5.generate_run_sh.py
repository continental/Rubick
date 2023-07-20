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
import os.path

import pylcs

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='This script is used to generate run_all.sh')
    parser.add_argument("-e", "--entryfile", help="The location of json format Sourcegraph code search result file.",
                        required=True, type=str)
    parser.add_argument("-o", "--out", help="The location to store the downloaded jars")
    args = parser.parse_args()
    with open(args.out + "/run_all.sh", "w") as run_sh_file:
        #run_sh_file.write("#!/usr/bin/env bash\nset -e\nset -x\n")
        run_sh_file.write("#!/usr/bin/env bash\nset -x\n")
        with open(args.entryfile, "r") as pf:
            for line in pf:
                if line.strip():
                    if line.startswith("#"):
                        if line.startswith("# Repo: "):
                            command = "timeout -s SIGKILL 15m ./run.sh -0 ex "
                            jar_list = []
                        elif line.startswith("# -j: "):
                            #print('adding "%s" from "%s" to jar_list' % (line, line[5:].strip()))
                            jar_list.append(line[5:].strip() + " ")
                        elif line.startswith("# -e: "):
                            command = command + "-e " + line[5:].strip() + " "
                        elif line.startswith("# -t: "):
                            command = command + "-t " + line[5:].strip() + " "
                    else:
                        command = command + "-p '" + line.strip() + "' "
                        for jar in jar_list:
                            run_sh_file.write(
                                command + "-j " + jar + "-o " + jar.replace("/jars_unzip/", "/extracted/") + "\n")
