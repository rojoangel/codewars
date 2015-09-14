module SortGiftCode where

sortGiftCode :: String -> String
sortGiftCode []          = []
sortGiftCode (x:xs)      = smallerSorted ++ [x] ++ biggerSorted -- using quicksort
  where smallerSorted    = sortGiftCode [s | s <- xs, s < x]
        biggerSorted     = sortGiftCode [s | s <- xs, s > x]
