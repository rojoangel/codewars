(ns digital-root.core)

(defn digital-root [n]
   (reduce + (map #(Character/digit % 10) (str n)))
)
