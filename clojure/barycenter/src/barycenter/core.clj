(ns barycenter.core)

(defn round-ratio
  [ratio]
  (double (/ (Math/round (* 10000 (double ratio))) 10000))
  )

(defn bar-triang [[a b] [c d] [e f]]
  [(round-ratio (/ (+ a c e) 3)) , (round-ratio (/ (+ b d f) 3))])