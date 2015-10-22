(ns counting-power-sets.core-test
  (:require [clojure.test :refer :all]
            [counting-power-sets.core :refer :all]))

(deftest a-test1
  (testing "Basic tests"
    (is (= 1 (powers [])))
    (is (= 2 (powers [1])))
    (is (= 4 (powers [1 2])))
    (is (= 8 (powers [1 2 3])))
    (is (= (powers (range 100)) 1267650600228229401496703205376N))))
