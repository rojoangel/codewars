(ns weightsort.core
  (:require [clojure.string :as str]))

(defn order-weight [strng]
  (letfn [(digits [number]
            (map #(Character/digit % 10) number))
          (weight [digits]
            (reduce + digits))]
    (str/join " "
              (sort-by (juxt #(weight (digits %)) str)
                       (str/split strng #" ")))))
