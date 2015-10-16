(ns dir-reduc.core)

(defn dirReduc [arr]
  (let [reducible #{'("NORTH","SOUTH") '("SOUTH","NORTH")
                    '("EAST","WEST") '("WEST","EAST")}
        reducible? (partial contains? reducible)]
  (if (reducible? (take 2 arr))
    (dirReduc (seq (drop 2 arr)))
    (identity arr))))
