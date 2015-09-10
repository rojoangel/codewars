module Codewars.Kata.Collatz where

collatz :: Integer -> Int
collatz = length . collatzSequence

collatzSequence :: Integer -> [Integer]
collatzSequence n
  | even n      =   n : collatzSequence (n `div` 2)
  | otherwise  = [1]
