(ns dir-reduc.core)

(defn dirReduc
  ([arr] (dirReduc arr []))
  ([arr accumulate]
  (let [reducible #{'("NORTH","SOUTH") '("SOUTH","NORTH")
                    '("EAST","WEST") '("WEST","EAST")}
        reducible? (partial contains? reducible)]
  (if (empty? arr)
    (seq accumulate)
    (if (reducible? (take 2 arr))
      (recur (seq (drop 2 arr)) accumulate)
      (recur (rest arr) (conj accumulate (first arr))))))))
