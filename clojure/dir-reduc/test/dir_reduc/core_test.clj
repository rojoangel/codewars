(ns dir-reduc.core-test
  (:require [clojure.test :refer :all]
            [dir-reduc.core :refer :all]))

(deftest non-reducible-steps
  (testing "single step"
    (is (= (dirReduc ["NORTH"]) ["NORTH"])))
  (testing "multiple steps"
    (is (= (dirReduc ["NORTH", "EAST"]) ["NORTH", "EAST"])))
  )
