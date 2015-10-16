(ns dir-reduc.core)

(defn dirReduc [arr]
  (if (= (take 2 arr) '("NORTH" "SOUTH"))
    (seq (drop 2 arr))
    (identity arr)))
