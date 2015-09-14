module Codewars.Kata.XO where

import Data.Char (toUpper)

-- | Returns true if the number of
-- Xs is equal to the number of Os
-- (case-insensitive)
xo :: String -> Bool
xo str = os == xs
  where os = sum [1 | s <- str, toUpper s == 'O']
        xs = sum [1 | s <- str, toUpper s == 'X']
