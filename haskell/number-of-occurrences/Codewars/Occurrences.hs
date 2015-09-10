module Codewars.Occurrences where

numberOfOccurrences :: Eq a => a -> [a] -> Int
numberOfOccurrences x = length . filter (x ==)
