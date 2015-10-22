(ns multiples-of-3-and-5.core-test
  (:require [clojure.test :refer :all]
            [multiples-of-3-and-5.core :refer :all]))

(deftest test-multiples-of-3-and-5
  (is (= 23 (solution 10))))
