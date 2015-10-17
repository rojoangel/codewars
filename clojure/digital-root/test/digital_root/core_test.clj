(ns digital-root.core-test
  (:require [clojure.test :refer :all]
            [digital-root.core :refer :all]))

(deftest digital-root-example-test
  (is (= (digital-root 16) 7)))
