(ns summation.core)

(defn sum [& nums]
  "Finds the sum of all of its arguments"
  (apply + nums))
