(ns comet-fan.core)

(comment
  (defn to-number
    [name]
    (reduce * (map #(- (int %) 64) name)))
)

(defn ride
  "Returns GO if the group gets to go and STAY otherwise"
  [group comet]
  (letfn [(to-number [name] (mod (reduce * (map #(- (int %) 64) name)) 47))]
    (if (= (to-number group) (to-number comet)) "GO" "STAY")))
