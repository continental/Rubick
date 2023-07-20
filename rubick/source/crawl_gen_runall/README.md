```
# put the target to the targets.txt file
# one target a line
# then run "./src_search.sh input_file output_dir"
./src_search.sh target.txt ./results
# then we run the python script to analyze the sourcegraph json file.
python crawl_repo_info.py

python generate_p_info.py
python unzip.py
python generate_run_sh.py

unzip jars/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies.jar -d jars/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies

bash run.sh ex \
    -j 'jars/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies' \
    -p 'technology\.tabula.*' \
    -e '.*' \
    -t 'org\.apache\.pdfbox\.pdmodel\.PDDocument.*' \
    -o 'extracted/tabulapdf/tabula-java/tabula-1.0.5-jar-with-dependencies'

find extracted -type f -name '*.dot' -size -100k > .drawed_dot.txt
cat .drawed_dot.txt | parallel dot -Tpdf '{}' -O
```
