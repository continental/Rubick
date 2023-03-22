# Introduction

Here lists all the fuzz drivers and configurations used in evaluation of our paper. 

Use the following command to build and quick test all fuzz drivers.
```bash
bash test_all.sh
```

## Requirements

We did not directly put the jars into this repository, but you can download all jars of Rubick and dependent libraries from the [link](https://drive.google.com/drive/folders/17ypqGs8IITtCWxSs5a8Lt5SaJe6pTJVp?usp=share_link), and run the following command to put it in the right place.

```
bash copy.sh PATH_OF_DIR_DOWNLOAD_FROM_DRIVE
```

- bazel, 4.2.1
- Java, openjdk 11.0.11, higher version of Java should be okay but not tested

# Memos

The mappings between the directory names and the evaluated baseline names in paper. The directory contains driver code, configuration files, seeds, and scripts. They can be used for building and testing the corresponding fuzz driver. `jazzer` directory includes the jars of jazzer we used.

## for RQ2
- `harness_all_fuzzgen` -> fuzzgen
- `harness_all_human` -> manual
- `harness_all_rnd1seed` -> rubick

## for RQ3 C1
- `harness_all_rnd1seed` -> w. cf
- `harness_all_wocf` -> w.o. cf

## for RQ3 C2
- `harness_all_rnd1seed` -> denoised
- `harness_all_raw` -> raw

## for RQ3 C3
- `harness_all_rnd1seed` -> rnd1seed
- `harness_all_cfseeds` -> cfseeds
- `harness_all_itercf` -> itercf
- `harness_all_rnd1cf` -> rnd1cf
