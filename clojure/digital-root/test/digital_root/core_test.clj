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
  (testing "digital-root of a different digit should be the digit"
    (is (= (digital-root 8) 8)))
  )

(deftest double-digit
  (testing "digital-root of a double digit should be the sum of the digits"
    (is (= (digital-root 16) 7)))
  )

(deftest triple-digit
  (testing "digital-root of a triple digit should be the sum of the digits"
    (is (= (digital-root 161) 8)))
  )
