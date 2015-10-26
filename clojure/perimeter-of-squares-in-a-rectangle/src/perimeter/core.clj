(ns perimeter.core)

(defn perimeter [n]
  (letfn [(fib [a b] (cons a (lazy-seq (fib b (+ b a)))))]
  (* 4N (apply + (take (inc n) (fib 1N 1N))))))
