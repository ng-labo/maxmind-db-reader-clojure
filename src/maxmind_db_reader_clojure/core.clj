(ns maxmind-db-reader-clojure.core
  (:import [com.maxmind.db Reader NoCache])
  (:import [com.maxmind.db Reader$FileMode])
  (:import [java.io File])
  (:import [java.net InetAddress])
)

(defn lookup [ path-to-mmdb ipaddress ]
  (let [ans (.get
              (Reader.
                (File. path-to-mmdb)
                Reader$FileMode/MEMORY_MAPPED
                (NoCache/getInstance))
              (InetAddress/getByName ipaddress))]
    (if (some? ans) (.toString ans) nil)))

