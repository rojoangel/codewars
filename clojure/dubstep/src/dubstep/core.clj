(ns dubstep.core
  (:require [clojure.string :require [trim replace] :as str]))

(defn song-decoder [song]
  (str/trim (str/replace song #"(WUB)+" " ")))
