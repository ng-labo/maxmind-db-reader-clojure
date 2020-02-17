(ns maxmind-db-reader-clojure.core-test
  (:require [clojure.test :refer :all]
            [clojure.data.json :as json]
            [maxmind-db-reader-clojure.core :refer :all]))

;(deftest a-test
;  (testing "FIXME, I fail."
;    (is (= 0 1))))

(def MMDBFILE "GeoLite2-ASN.mmdb")

(deftest famous-ip
  (def ans (lookup MMDBFILE "8.8.8.8"))
  (testing "lookup 8.8.8.8"
    (is (= 15169 (get (json/read-str ans) "autonomous_system_number")))))

(deftest bogon-ip
  (def ans (lookup MMDBFILE "192.168.0.1"))
  (testing "lookup 192.168.0.1"
    (is (nil? ans))))
