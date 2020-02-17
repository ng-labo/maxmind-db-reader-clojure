(ns maxmind-db-reader-clojure.core
  (:import com.maxmind.db.Reader)
  (:import com.maxmind.db.NoCache)
  (:import java.io.File)
  (:import java.net.InetAddress) 
)

(defn lookup [ path-to-mmdb ipaddress ]
  (let [ans (.get
            (new com.maxmind.db.Reader
              (new java.io.File path-to-mmdb)
              com.maxmind.db.Reader$FileMode/MEMORY_MAPPED
              (com.maxmind.db.NoCache/getInstance))
            (java.net.InetAddress/getByName ipaddress))]
    (if (some? ans) (.toString ans) nil)
  )
)

