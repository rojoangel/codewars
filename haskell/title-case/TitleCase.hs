module TitleCase (titleCase) where

import Data.Char

titleCase :: String -> String -> String
titleCase zs xs = unwords $ toTitleCase (words xs)
  where toTitleCase []      = []
        toTitleCase (w:ws)  = wordToCapital w : map wordToTitleCase ws
        wordToTitleCase []      = []
        wordToTitleCase word
          | wordToLower word `elem` minors  = wordToLower word
          | otherwise                       = wordToCapital word
        minors = map wordToLower $ words zs
        wordToLower = map toLower
        wordToCapital []     = []
        wordToCapital (y:ys) = toUpper y : map toLower ys
