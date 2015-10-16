(ns dir-reduc.core)

(defn dirReduc [arr]
  (let [reducible #{'("NORTH","SOUTH") '("SOUTH","NORTH")}
        reducible? (partial contains? reducible)]
  (if (reducible? (take 2 arr))
    (seq (drop 2 arr))
    (identity arr))))
