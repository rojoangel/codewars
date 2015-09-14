module Codewars.Kata.Next5 where

roundToNext5 :: Int -> Int
roundToNext5 n
  | n `mod` 5 == 0  = n
  | otherwise       = (n `div` 5) * 5 + 5
