# Introduction

Using `bash example.sh` can get a minimal example running the whole workflow (starting from step 1).

Rubick has several standalone components. According to its workflow, the components are listed in the following steps.

# Step 0: Usage Crawling
The source code of crawl is in `crawl_gen_runall`. There are five sub-steps for crawling, the first two sub-steps are used for crawling related repositories based on SourceGraph. The last three sub-steps are used for preparing the targets (find analyzable jar tar files) and commands used in usage extraction.  

`crawl_workflow.sh` and `analyze_workflow.sh` wraps the usage script and `crawl-batch.sh` and `analyze-batch.sh` shows some examples on how we use these two workflow scripts.

# Step 1: Usage Extraction
The extraction of usage automaton is running `bash run.sh ex ...` command to extract the raw usage automaton from the learning examples. See more in `bash run.sh ex -h` and the source code is inside `src`.

# Step 2: Pre-learn Processing
Before learning the usage automaton, we merge the alphabet using the source code inside `automata`.

# Step 3: Usage Active Learning
Using `run.sh` with `al` command to start active learning of the usage automaton. The source code is inside `src`.

# Step 4: Fuzz Driver Generation
Using `run.sh` with `gen` command to generate the final usage automaton. The source code is inside `src`.
