(ns barycenter.core-test
  (:require [clojure.test :refer :all]
            [barycenter.core :refer :all]))

(deftest a-test1
  (testing "Basic tests"
    (is (= (bar-triang [4, 6], [12, 4], [10, 10]) [8.6667, 6.6667]))
    (is (= (bar-triang [4, 2], [12, 2], [6, 10]) [7.3333, 4.6667]))
    (is (= (bar-triang [4, 8], [8, 2], [16, 6]) [9.3333, 5.3333]))
    (is (= (bar-triang [0, 0], [1, 3], [-1, 6]) [0.0, 3.0]))
    (is (= (bar-triang [0, 0], [1, 6], [8, -6]) [3.0, 0.0]))
    ))