(ns dubstep.core-test
  (:require [expectations :refer :all]
            [dubstep.core :refer :all]))

;; When song contains no dub sequence should return song
(expect "I" (song-decoder "I"))

;; When song contains dub sequence at the beginning it should be removed
(expect "I" (song-decoder "WUBI"))

;; When song contains dub sequence at the end it should be removed
(expect "I" (song-decoder "IWUB"))

;; When song contains dub sequence at the beginning & end it should be removed
(expect "I" (song-decoder "WUBIWUB"))

;; When song contains multiple words they should be separated by a whitespace
(expect "I ROCK" (song-decoder "IWUBROCK"))

;; Codewars test 1
(expect "A B C" (song-decoder "AWUBBWUBC"))

;; Codewars test 2
(expect"A B C" (song-decoder "AWUBWUBWUBBWUBWUBWUBC"))

;; Codewars test 3
(expect "A B C" (song-decoder "WUBAWUBBWUBCWUB"))
