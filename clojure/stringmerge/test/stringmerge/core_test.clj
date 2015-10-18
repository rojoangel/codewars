(ns stringmerge.core-test
  (:require [clojure.test :refer :all]
            [stringmerge.core :refer :all]))

(deftest empty-collections
  (testing "nil should be merge of nil nil"
    (is (is-merge nil nil nil)))
  (testing "empty should be merge of empty empty"
    (is (is-merge "" "" "")))
  )

(deftest single-characters
  (testing "c should be merge of c nil"
    (is (is-merge "c" "c" nil)))
  (testing "c should be merge of nil c"
    (is (is-merge "c" nil "c")))
  )

(deftest code
  (testing "codewars should not be merge of codes and wars"
    (is (not (is-merge "codewars" "codes" "wars")))))

(deftest codewars-tests
 (testing "codewars is code and wars"
   (is (is-merge "codewars" "code" "wars")))
 (testing "codewars is cdw and oears"
   (is (is-merge "codewars" "cdw" "oears")))
 (testing "codewars are not codwars"
   (is (not( is-merge "codewars" "cod" "war")))))
