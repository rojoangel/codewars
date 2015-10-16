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
      (recur (concat accumulate (seq (drop 2 arr))) [])
      (recur (rest arr) (conj accumulate (first arr))))))))
