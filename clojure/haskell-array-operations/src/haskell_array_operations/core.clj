(ns haskell-array-operations.core)

(defn head [xs]
  (first xs))

(defn tail [xs]
  (drop 1 xs))

(defn init [xs]
  (drop-last xs))

(defn last_ [xs]
  (last xs))
