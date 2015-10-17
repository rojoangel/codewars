(ns dubstep.core
  (:require [clojure.string :require [join blank? split] :as str]))

(defn song-decoder [song]
  (str/join " "
            (filter #(not (str/blank? %))
                    (str/split song #"WUB"))))
