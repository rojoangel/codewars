(ns dubstep.core)

(defn song-decoder [song]
  (clojure.string/replace song #"WUB" "")
)
