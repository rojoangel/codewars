(ns dir-reduc.core-test
  (:require [clojure.test :refer :all]
            [dir-reduc.core :refer :all]))

(deftest single-steps
  (testing "north is north"
    (is (= (dirReduc ["NORTH"]) ["NORTH"])))
  )
