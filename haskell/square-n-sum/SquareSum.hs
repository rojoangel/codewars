module SquareSum where

squareSum :: [Integer] -> Integer
squareSum = foldl (\acc x -> acc + x^2 ) 0
