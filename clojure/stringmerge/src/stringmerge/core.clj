(ns stringmerge.core)

(defn is-merge
  "Returns whether a string is a merge of two other strings"
  [s p1 p2]
  (if (and (empty? s) (empty? p1) (empty? p2))
    true
    false))
