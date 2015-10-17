(ns digital-root.core-test
  (:require [clojure.test :refer :all]
            [digital-root.core :refer :all]))

(comment
(deftest digital-root-example-test
  (is (= (digital-root 16) 7)))
)

(deftest single-digit
  (testing "digital-root of a single digit should be the digit"
    (is (= (digital-root 9) 9)))
  )
