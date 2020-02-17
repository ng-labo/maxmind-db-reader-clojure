(defproject maxmind-db-reader-clojure "0.1.0-SNAPSHOT"
  :description "A wrapper for MaxMind-DB-Reader-java to use on Clojure."
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.maxmind.db/maxmind-db "1.3.0"]
                 [org.clojure/data.json "0.2.7"]]
  :repl-options {:init-ns maxmind-db-reader-clojure.core})
