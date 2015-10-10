(ns even-or-odd.core)

(defn even-or-odd [number]
  (if (even? number)
    "Even"
    "Odd"))
