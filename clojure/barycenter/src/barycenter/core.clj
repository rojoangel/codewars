(ns barycenter.core)

(defn round-ratio
  [ratio]
  (double (/ (Math/round (* 10000 (double ratio))) 10000)))

(defn bar-coordinate
  [c1 c2 c3]
  (round-ratio (/ (+ c1 c2 c3) 3)))

(defn bar-triang
  [[a b] [c d] [e f]]
  [(bar-coordinate a c e) , (bar-coordinate b d f)])
