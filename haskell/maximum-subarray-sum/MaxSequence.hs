module MaxSequence where

import Data.List
import Data.Ord (comparing)

-- Return the greatest subarray sum within the array of integers passed in.
maxSequence :: [Int] -> Int
maxSequence xs = sum $ maximumBy (comparing sum) (contiguousSubsequences xs)
  where contiguousSubsequences = ([]:) . concatMap (tail . inits) . tails
