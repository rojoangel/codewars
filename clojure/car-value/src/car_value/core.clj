(ns car-value.core)

(defn depreciation
  [year]
  (if (< year 3)
    0.20
    0.10)
  )

(defn car
  [price years]
  (loop [value price
         year 1]
    (let [depreciated-value (* value (- 1 (depreciation year)))]
      (if (= year years)
        (format "%.2f" (double depreciated-value))
        (recur depreciated-value (inc year))))))
