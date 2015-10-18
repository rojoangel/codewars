(ns stringmerge.core)

(defn is-merge
  "Returns whether a string is a merge of two other strings"
  [s p1 p2]
  (if (and (empty? s) (empty? p1) (empty? p2))
    true
    (if (= (first s) (first p1))
      (recur (rest s) (rest p1) p2)
      (if (= (first s) (first p2))
        (recur (rest s) p1 (rest p2))
        false))))
