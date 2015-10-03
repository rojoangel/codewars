module Codewars.Kata.Sort where

sort :: Ord a => [a] -> [a]
sort []     = []
sort (x:xs) = smallerSorted ++ [x] ++ greaterSorted
  where smallerSorted = sort [x' | x' <- xs, x' <= x]
        greaterSorted = sort [x' | x' <- xs, x' >  x]
