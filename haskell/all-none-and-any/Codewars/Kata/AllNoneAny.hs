module Codewars.Kata.AllNoneAny where

import Prelude hiding (all, any)

all, none, any :: (a -> Bool) -> [a] -> Bool
-- all f xs  = (length xs) == (length (filter f xs)) -- gives out of memory
-- all f xs  = (length xs) == length (takeWhile f xs) -- gives out of memory too, due to the length xs
all _ []       = True
all f (x:[])   = f x
all f (x:xs)
  | f x        = all f xs
  | otherwise  = False

none _ []      = True
none f (x:[])  = not (f x)
none f (x:xs)
  | f x        = False
  | otherwise  = none f xs

any _ []       = False
any f (x:[])   = f x
any f (x:xs)
  | f x        = True
  | otherwise  = any f xs
