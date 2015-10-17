(ns dubstep.core-test
  (:require [expectations :refer :all]
            [dubstep.core :refer :all]))

;; When song contains no dub sequence should return song
(expect "I" (song-decoder "I"))

;; When song contains dub sequence at the beginning it should be removed
(expect "I" (song-decoder "WUBI"))

;; When song contains dub sequence at the end it should be removed
(expect "I" (song-decoder "IWUB"))

;;(expect "A B C" (song-decoder "AWUBBWUBC"))

;;(expect"A B C" (song-decoder "AWUBWUBWUBBWUBWUBWUBC"))

;;(expect "A B C" (song-decoder "WUBAWUBBWUBCWUB"))
