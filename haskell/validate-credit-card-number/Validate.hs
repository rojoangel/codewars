module Validate where

validate :: Integer -> Bool
validate i = sum (map sumDigits $ doubleEveryOther $ reverseDigits i) `mod` 10 == 0
  where reverseDigits 0             = [0]
        reverseDigits n             = n `mod` 10 : reverseDigits (n `div` 10)
        doubleEveryOther []         = []
        doubleEveryOther [x']       = [x']
        doubleEveryOther [x',x]     = [x', x * 2]
        doubleEveryOther (x':x:xs)  = x' : 2 * x : doubleEveryOther xs
        sumDigits 0                 = 0
        sumDigits n                 = (n `mod` 10) + sumDigits (n `div` 10)
