(ns dubstep.core-test
  (:require [expectations :refer :all]
            [dubstep.core :refer :all]))

;; When song contains no dub sequence should return song
(expect "I" (song-decoder "I"))

;;(expect "A B C" (song-decoder "AWUBBWUBC"))

;;(expect"A B C" (song-decoder "AWUBWUBWUBBWUBWUBWUBC"))

;;(expect "A B C" (song-decoder "WUBAWUBBWUBCWUB"))
