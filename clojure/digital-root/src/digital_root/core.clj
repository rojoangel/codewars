(ns digital-root.core)

(defn digital-root [n]
  (let [digits (map #(Character/digit % 10) (str n))]
   (reduce + digits)))
