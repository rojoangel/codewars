(ns weightsort.core-test
  (:require [clojure.test :refer :all]
            [weightsort.core :refer :all]))

(require '[clojure.string :as str])

(deftest single-item
  (testing "weighting a single item should return the item itself"
    (is (= (order-weight "100") "100"))))

(deftest two-items
  (testing "weighting already ordered items should return the items"
    (is (= (order-weight "100 101") "100 101")))
  (testing "weighting unordered items should return the ordered items"
    (is (= (order-weight "101 100") "100 101")))
  (testing "same weighted items should be ordered as strings"
    (is (= (order-weight "27 18") "18 27"))))

(comment
(deftest big-numbers
  (testing "should work for big numbers"
    (is (= (order-weight "1234000 44444444") "1234000 44444444"))))

  (deftest a-test1
    (testing "Basic tests"
      (is (= (order-weight "103 123 4444 99 2000") "2000 103 123 4444 99"))
      (is (= (order-weight "2000 10003 1234000 44444444 9999 11 11 22 123") "11 11 2000 10003 22 123 1234000 44444444 9999"))))
)
