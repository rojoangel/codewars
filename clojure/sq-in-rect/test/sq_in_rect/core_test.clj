(ns sq-in-rect.core-test
  (:require [clojure.test :refer :all]
            [sq-in-rect.core :refer :all]))

(deftest a-test1
  (testing "Test 1"
    (is (= (sq-in-rect 5 3) [3 2 1 1]))))
(deftest a-test2
  (testing "Test 2"
    (is (= (sq-in-rect 5 5) nil))))
