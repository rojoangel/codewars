(ns multiples-of-3-and-5.core)

(defn solution [number]
  (reduce + (filter #(or (zero? (mod % 5)) (zero? (mod % 3))) (range number))))
