(ns stringmerge.core-test
  (:require [clojure.test :refer :all]
            [stringmerge.core :refer :all]))

(deftest example-tests
 (testing "codewars is code and wars"
   (is (is-merge "codewars" "code" "wars")))
 (testing "codewars is cdw and oears"
   (is (is-merge "codewars" "cdw" "oears")))
 (testing "codewars are not codwars"
   (is (not( is-merge "codewars" "cod" "war")))))
