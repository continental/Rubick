#!/usr/bin/python
# -*- coding: UTF-8 -*-
"""
-------------------------------------------------
@File    : unzip.py
@Time    : 24/2/22 5:52 PM
@Author  : Han0nly
@Github  : https://github.com/Han0nly
@Email   : zhangxh@stu.xidian.edu.cn
-------------------------------------------------
"""
import argparse
import os


def findAllFile(base):
    matches = set([])
    for root, ds, fs in os.walk(base):
        for f in fs:
            if f[-3:] in ("jar", "JAR", "ear", "EAR", "aar", "AAR", "war"):
                fullname = os.path.join(root, f)
                # avoid the possible error caused by change files during the iteration
                #yield fullname
                matches.add(fullname)

    return matches


def jarxf(jarfile, extract_to):
    os.makedirs(extract_to, exist_ok=True)

    print('extract %s to %s' % (jarfile, extract_to))

    # switch to abs path after replacement and makedir
    jarfile = os.path.abspath(jarfile)
    extract_to = os.path.abspath(extract_to)

    # jar xf (it will cd to workdir since jar cannot specify out dir
    os.system( "bash ./crawl_gen_runall/use-jar.sh '%s' '%s'" % (jarfile, extract_to) )


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='This script is used to unzip all the jar format files in a folder '
                                                 'recursively and store extracted files to a given folder')
    parser.add_argument("-i", "--jardir", help="The location of the jars needed to be extracted.",
                        required=True, type=str)
    #parser.add_argument("-o", "--out", help="The location to store the extracted files")
    args = parser.parse_args()

    queue = [ ]

    for jarfile in findAllFile(args.jardir):
        # first time, change the path from jars to jars_unzip
        extract_to = jarfile.replace("/jars/", "/jars_unzip/")[:-4]
        jarxf(jarfile, extract_to)
        queue.append(extract_to)

    while True:
        if len(queue) == 0:
            break

        target_dir = queue.pop(0)

        for jarfile in findAllFile(target_dir):
            extract_to = jarfile[:-4] + "_extracted"
            jarxf(jarfile, extract_to)
            queue.append(extract_to)

