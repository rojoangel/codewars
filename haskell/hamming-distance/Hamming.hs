module Hamming where

hamming :: String -> String -> Int
hamming a b = length . filter id $ zipWith (/=) a b
