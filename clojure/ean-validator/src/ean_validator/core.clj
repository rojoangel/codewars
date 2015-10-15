(ns ean-validator.core)

(defn validate-ean [ean-code]
  (let [digitalized-ean (map #(Character/digit % 10) ean-code)
        checksum (last digitalized-ean)
        digits (butlast digitalized-ean)
        sum-odds (reduce + (take-nth 2 digits))
        sum-evens (reduce + (take-nth 2 (rest digits)))
        sum (+ sum-odds (* 3 sum-evens))]
    (== checksum (mod (- 10 (mod sum 10)) 10))))
