module Codewars.Occurrences where

numberOfOccurrences :: Eq a => a -> [a] -> Int
numberOfOccurrences x xs = length $ filter (x ==) xs
