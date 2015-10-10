module Codewars.Kata.CarValue where

import Text.Printf

car :: Float -> Integer -> String
car price years = printf "%.2f" $ price * depreciation
  where depreciation = depreciation20 * depreciation10
        depreciation20 = 0.80 ^ years20
        depreciation10 = 0.90 ^ years10
        years20 =  min years 2
        years10 = max 0 (years - 2)
