(ns unpack.core)

(defn spread
  [func, args]
  (apply func args)
)
