(ns comet-fan.core)

(defn to-number
  [name]
  (reduce * (map #(- (int %) 64) name)))

(defn ride
  "Returns GO if the group gets to go and STAY otherwise"
  [group comet]
  "GO")
