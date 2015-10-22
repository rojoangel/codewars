(ns multiples-of-3-and-5.core)

(defn solution [number]
  (reduce + (filter #(or (= (mod % 5) 0) (= (mod % 3) 0)) (range number))))
