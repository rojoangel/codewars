(ns dubstep.core
  (:require [clojure.string :as str]))

(defn song-decoder [song]
  (str/join " "
            (filter #(not (str/blank? %))
                    (str/split song #"WUB"))))
