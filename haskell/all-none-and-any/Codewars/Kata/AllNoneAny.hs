module Codewars.Kata.AllNoneAny where

import Prelude hiding (all, any)

all, none, any :: (a -> Bool) -> [a] -> Bool
all _ []       = True
all f (x:xs)
  | f x        = all f xs
  | otherwise  = False

none _ []      = True
none f (x:xs)
  | f x        = False
  | otherwise  = none f xs

any _ []       = False
any f (x:xs)
  | f x        = True
  | otherwise  = any f xs
