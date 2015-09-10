module Reverse where
import Prelude hiding (reverse)

-- | Reverse a list
reverse :: [a] -> [a]
reverse []     = []
reverse (x:xs) = reverse xs ++ [x]
