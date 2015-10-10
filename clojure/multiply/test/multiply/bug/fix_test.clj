(ns multiply.bug.fix-test
  (:require [clojure.test :refer :all]
            [multiply.bug.fix :refer :all]))

(deftest Examples...
  (is (= (multiply 0 1) 0) )
  (is (= (multiply 1 2) 2) )
  (is (= (multiply 2 3) 6) )
  (is (= (multiply 4 5) 20) )
  )