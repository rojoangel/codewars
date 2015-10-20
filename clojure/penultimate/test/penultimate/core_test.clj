(ns penultimate.core-test
  (:require [clojure.test :refer :all]
            [penultimate.core :refer :all]))

(deftest test-penultimate
  (let [input1 [1 9 13 1 99 9 9 13]]
    (testing (prn-str input1)
      (is (= (penultimate.core/penultimate input1) 9)))))
