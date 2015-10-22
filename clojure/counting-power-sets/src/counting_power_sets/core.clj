(ns counting-power-sets.core)

;; sum of binomial coefficients = 2^n (http://math.stackexchange.com/questions/734900/proof-by-induction-sum-of-binomial-coefficients-sum-k-0n-n-k-2n)
(defn powers [list]
  (reduce * (repeat (count list) 2N)))
