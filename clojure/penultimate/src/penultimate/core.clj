(ns penultimate.core)

(defn penultimate
  "Gets the second to last element of an ISeq"
  [lst]
  (first (take-last 2 lst))
)
