(defproject redd/dfs-datastores "1.0.4"
  :description "A dramatically simpler and more powerful way to store
records on a distributed filesystem."
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [jvyaml "1.0.0"]
                 [com.google.collections/google-collections "1.0"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [junit/junit "3.8.2"]
                     [swank-clojure "1.4.0-SNAPSHOT"]
                     [clojure-source "1.2.0"]
                     [marginalia "0.5.1"]
                     [midje "1.2-alpha3"]]
  :tasks [marginalia.tasks])
