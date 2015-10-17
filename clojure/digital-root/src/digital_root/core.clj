(ns digital-root.core)

(defn digital-root [n]
  (let [digits (map #(Character/digit % 10) (str n))
        sum (reduce + digits)]
   (if (> sum 9)
     (digital-root sum)
     sum)))
