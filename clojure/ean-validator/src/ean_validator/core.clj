(ns ean-validator.core)

(defn validate-ean [ean-code]
  (== 0
      (mod
       (- 10
          (mod
           (reduce +
                   (map *
                        (map #(- (int %) 48) (seq (str ean-code)))
                        (flatten (repeat (list* 1 3 [1 3])))
                        )
                   )
           10)
          )
       10)
      )
  )
