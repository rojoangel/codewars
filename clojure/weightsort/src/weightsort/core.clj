(ns weightsort.core
  (:require [clojure.string :as str]))

(defn order-weight [strng]
  (letfn [(extract-digits [number]
            (map #(Character/digit % 10) number))
          (weight [digits]
            (let [sum (reduce + digits)]
              (if (> sum 9) (recur (extract-digits (str sum))) sum)))]
    (str/join " "
              (sort-by (juxt #(weight (extract-digits %)) identity) (str/split strng #" ")))))
