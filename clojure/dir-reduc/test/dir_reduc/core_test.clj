(ns dir-reduc.core-test
  (:require [clojure.test :refer :all]
            [dir-reduc.core :refer :all]))

(deftest non-reducible-steps
  (testing "single step"
    (is (= (dirReduc ["NORTH"]) ["NORTH"])))
  (testing "multiple steps"
    (is (= (dirReduc ["NORTH", "EAST"]) ["NORTH", "EAST"])))
  )

(deftest two-reducible-steps
  (testing "NORTH annihilates SOUTH"
    (is (nil? (dirReduc ["NORTH", "SOUTH"]))))
  (testing "SOUTH annihilates NORTH"
    (is (= (dirReduc ["SOUTH", "NORTH", "EAST"]) ["EAST"])))
  (testing "EAST annihilates WEST"
    (is (= (dirReduc ["EAST", "WEST", "EAST", "NORTH"]) ["EAST", "NORTH"])))
  (testing "WEST annihilates EAST"
    (is (nil? (dirReduc ["WEST", "EAST"]))))
  )
