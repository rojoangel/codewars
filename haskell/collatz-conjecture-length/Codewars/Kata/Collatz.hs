module Codewars.Kata.Collatz where

collatz :: Integer -> Int
collatz = length . collatzSequence

collatzSequence :: Integer -> [Integer]
collatzSequence 1 = [1]
collatzSequence 2 = 2 : collatzSequence (2 `div` 2)
