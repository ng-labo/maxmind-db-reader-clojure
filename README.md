# MaxMind-DB-Reader-clojure

A wrapper of MaxMind-DB-Reader-java to use on Clojure.

## Usage

get a [mmdb file](https://maxmind.github.io/MaxMind-DB/ "mmdb file") by your self. 

```
$ lein test
$ lein repl
maxmind-db-reader-clojure.core=> (lookup "GeoLite2-ASN.mmdb" "1.1.1.1")
"{\"autonomous_system_organization\":\"Cloudflare, Inc.\",\"autonomous_system_number\":13335}"
```

`maxmind-db-reader-clojure/lookup` answers a json text.

