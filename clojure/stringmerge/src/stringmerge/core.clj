(ns stringmerge.core)

(defn is-merge
  "Returns whether a string is a merge of two other strings"
  [s p1 p2]
  (if (and (nil? s) (nil? p1) (nil? p2))
    true
    false))
