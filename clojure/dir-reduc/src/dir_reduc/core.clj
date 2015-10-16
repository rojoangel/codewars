(ns dir-reduc.core)

(defn dirReduc [arr]
  (let [reducible? (partial contains? #{'("NORTH","SOUTH")})]
  (if (reducible? (take 2 arr))
    (seq (drop 2 arr))
    (identity arr))))
