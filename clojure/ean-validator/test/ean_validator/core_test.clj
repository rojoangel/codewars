(ns ean-validator.core-test
  (:require [clojure.test :refer :all]
            [ean-validator.core :refer [validate-ean]]))

(deftest example
  (are [code answer] (= (validate-ean code) answer)
    "9783815820865" true
    "9783815820864" false
    "9783827317100" true
    ))
