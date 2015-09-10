module Disemvowel where

disemvowel :: String -> String
disemvowel xs = [x | x <- xs, not $ x `elem` "aeiouAEIOU"]
