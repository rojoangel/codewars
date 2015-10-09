(ns car-value.core)

(defn car
  [price years]
  (let [years-20% (min years 2)
        years-10% (max 0 (- years 2))]
    (format
      "%.2f"
      (* price
         (Math/pow 0.80 years-20%)
         (Math/pow 0.90 years-10%)))))
