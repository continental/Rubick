load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "Fuzzer",
    srcs = glob(["src/main/java/com/fuzz/*.java"]),
    deps = [":deps"],
    create_executable = False,
    deploy_manifest_lines = ["Fuzzer: com.fuzz.Fuzzer"],
)

java_import(
    name = "deps",
    jars = glob(["jars/*.jar"]),
)
