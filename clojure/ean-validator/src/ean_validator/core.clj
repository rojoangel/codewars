(ns ean-validator.core)

(defn validate-ean [ean-code]
  (== 0
      (mod
       (- 10
          (mod
           (reduce +
                   (map *
                        (map #(Character/digit % 10) ean-code)
                        (flatten (repeat (list* 1 3 [1 3])))
                        )
                   )
           10)
          )
       10)
      )
  )
