(ns weightsort.core
  (:require [clojure.string :as str]))

(defn order-weight [strng]
  (letfn [(digits [number]
            (map #(Character/digit % 10) number))
          (weight [digits]
            (let [sum (reduce + digits)]
              (if (> sum 9) (recur sum) sum)))]
    (str/join " "
              (sort-by (juxt #(weight (digits %)) identity) (str/split strng #" ")))))
