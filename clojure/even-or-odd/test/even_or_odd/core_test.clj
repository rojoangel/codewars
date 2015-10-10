(ns even-or-odd.core-test
  (:require [clojure.test :refer :all]
            [even-or-odd.core :refer :all]))

(deftest Examples...
  (is (= (even-or-odd 2) "Even") )
  (is (= (even-or-odd 0) "Even") )
  (is (= (even-or-odd 7) "Odd") )
  (is (= (even-or-odd 1) "Odd") )
  )