(ns comet-fan.core-test
  (:require [clojure.test :refer :all]
            [comet-fan.core :refer :all]))

(comment
(deftest name-to-number
  (testing "single letter value should return its value"
    (is (= (to-number "A") 1)))
  (testing "a different single letter value should return a different value"
    (is (= (to-number "Z") 26)))
  (testing "multiple letters should get multiplied"
    (is (= (to-number "USACO") 17955))))
)

(deftest mission-stays
  (testing "mission should stay"
    (is (= (ride "COMETQ" "HVNGAZ") "STAY")))
  )
