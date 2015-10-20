(ns haskell-array-operations.core-test
  (:require [clojure.test :refer :all]
            [haskell-array-operations.core :refer :all]))

(deftest example-tests
  (is (head [5 1])      5)
  (is (tail [1])        [])
  (is (init [1 5 7 9])  [1 5 7])
  (is (last_ [7 2])     2)
)
