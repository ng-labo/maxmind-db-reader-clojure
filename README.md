# MaxMind-DB-Reader-clojure

A wrapper of MaxMind-DB-Reader-java to use on Clojure.

## Usage

```
$ lein test
$ lein repl
MaxMind-DB-Reader-clojure.core=> (lookup "GeoLite2-ASN.mmdb" "1.1.1.1")
"{\"autonomous_system_organization\":\"Cloudflare, Inc.\",\"autonomous_system_number\":13335}"
```

`lookup` answer a json text.

