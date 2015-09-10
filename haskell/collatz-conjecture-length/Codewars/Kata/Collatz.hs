module Codewars.Kata.Collatz where

collatz :: Integer -> Int
collatz = length . collatzSequence

collatzSequence :: Integer -> [Integer]
collatzSequence _ = [1]
