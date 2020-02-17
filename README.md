# MaxMind-DB-Reader-clojure

A wrapper of MaxMind-DB-Reader-java to use on Clojure.

## Usage

```
$ lein test
$ lein repl
maxmind-db-reader-clojure.core=> (lookup "GeoLite2-ASN.mmdb" "1.1.1.1")
"{\"autonomous_system_organization\":\"Cloudflare, Inc.\",\"autonomous_system_number\":13335}"
```

`maxmind-db-reader-clojure/lookup` answers a json text.

