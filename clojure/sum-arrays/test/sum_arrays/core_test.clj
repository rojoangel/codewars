(ns sum-arrays.core-test
  (:require [clojure.test :refer :all]
            [sum-arrays.core :refer :all]))

(deftest Tests
  (is (= (sum []) 0))
  (is (= (sum [1 2 3]) 6))
  (is (= (sum [1.1 2.2 3.3]) 6.6))
  (is (= (sum '(4 5 6)) 15))
  (is (= (sum (range 101)) 5050)))
