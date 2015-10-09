(ns car-value.core)

(defn depreciation
  [year]
  (if (< year 3)
    0.20
    0.10)
  )

(defn car
  [price years]
  (loop [depreciated-value price
         year 1]
    (if (= year years)
      (format "%.2f" (double (* depreciated-value (- 1 (depreciation year)))))
      (recur (* depreciated-value (- 1 (depreciation year))) (inc year))
      )
    )
  )
