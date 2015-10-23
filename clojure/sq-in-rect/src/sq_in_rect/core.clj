(ns sq-in-rect.core)

(defn sq-in-rect
  ([lng wdth]
   (if (= lng wdth)
     nil
    (sq-in-rect lng wdth [])))
  ([lng wdth accumulated]
    (if (= lng wdth)
      (conj accumulated lng)
      (recur (- (max lng wdth) (min lng wdth))
             (min lng wdth)
             (conj accumulated (min lng wdth))))))
