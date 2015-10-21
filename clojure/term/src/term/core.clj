(ns term.core)

(defn nth-term
  [first n c]
  (+ first (* c n))
)
