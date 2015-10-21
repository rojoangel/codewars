(ns term.core-test
  (:require [clojure.test :refer :all]
            [term.core :refer :all]))

(deftest example-nth-term-test
  (is (= (nth-term 1 2 3) 7) )
  (is (= (nth-term 2 2 2) 6) )
  (is (= (nth-term -50 10 20) 150) )
)
