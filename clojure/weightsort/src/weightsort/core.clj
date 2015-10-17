(ns weightsort.core
  (:require [clojure.string :as str]))

(defn order-weight [strng]
  (str/join " " (str/split strng #" ")))
