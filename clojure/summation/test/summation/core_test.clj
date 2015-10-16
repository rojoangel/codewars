(ns summation.core-test
  (:require [clojure.test :refer :all]
            [summation.core :refer [sum]]))

(deftest simple-tests
  (is (sum 1) 1)
  (is (sum 1 2) 3)
  (is (sum 5 7 9) 21)
  (is (sum 12 1 1 1 1) 16)
  (is (sum 12 1 1 1 1 1 1) 18))
