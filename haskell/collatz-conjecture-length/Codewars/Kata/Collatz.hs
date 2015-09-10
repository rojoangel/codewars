module Codewars.Kata.Collatz where

collatz :: Integer -> Int
collatz = length . collatzSequence

collatzSequence :: Integer -> [Integer]
collatzSequence n
  | n == 1     = [1]
  | even n     = n : collatzSequence (n `div` 2)
  | otherwise  = n : collatzSequence (n * 3 + 1)
