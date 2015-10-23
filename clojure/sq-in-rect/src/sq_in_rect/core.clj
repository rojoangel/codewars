(ns sq-in-rect.core)

(defn sq-in-rect
  ([lng wdth]
   (if (= lng wdth)
     nil
    (sq-in-rect lng wdth [])))
  ([lng wdth accumulated]
    (let [min-side (min lng wdth)
          max-side (max lng wdth)]
     (if (= lng wdth)
      (conj accumulated lng)
      (recur (- max-side min-side) min-side (conj accumulated min-side))))))
