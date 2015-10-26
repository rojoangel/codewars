(ns perimeter.core-test
  (:require [clojure.test :refer :all]
            [perimeter.core :refer :all]))

(deftest a-test1
  (testing "test1"
    (is (= (perimeter 5) 80))))
(deftest a-test2
  (testing "test2"
    (is (= (perimeter 7) 216))))
(deftest a-test3
  (testing "test3"
    (is (= (perimeter 20) 114624))))
(deftest a-test4
  (testing "test4"
    (is (= (perimeter 30) 14098308))))
(deftest a-test5
  (testing "test5"
    (is (= (perimeter 100) 6002082144827584333104))))
