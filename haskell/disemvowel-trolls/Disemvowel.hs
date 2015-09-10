module Disemvowel where

disemvowel :: String -> String
disemvowel xs = [x | x <- xs, x `notElem` "aeiouAEIOU"]
