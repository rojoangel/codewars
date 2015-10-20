(ns unpack.core-test
  (:require [clojure.test :refer :all]
            [unpack.core :refer :all :as unpack]))

(deftest examples
  (is (= (unpack/spread + [1 2 3 4 5]) 15), "Spread isn't working!")
)
