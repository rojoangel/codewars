(ns haskell-array-operations.core-test
  (:require [clojure.test :refer :all]
            [haskell-array-operations.core :refer :all]))

(deftest example-tests
  (is (head [5 1 0])    5)
  (is (tail [1])        [])
  (is (tail [1 2 3])    [2 3])
  (is (init [1 5 7 9])  [1 5 7])
  (is (init [1])        [])
  (is (last_ [7 2])     2)
)
