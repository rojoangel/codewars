(ns dubstep.core-test
  (:require [expectations :refer :all]
            [dubstep.core :refer :all]))

(expect "A B C" (song-decoder "AWUBBWUBC"))

(expect "A B C" (song-decoder "AWUBWUBWUBBWUBWUBWUBC"))

(expect "A B C" (song-decoder "WUBAWUBBWUBCWUB"))
