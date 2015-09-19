module TitleCase (titleCase) where

import Data.Char

titleCase :: String -> String -> String
titleCase zs xs = unwords . map wordToTitleCase $ words xs
  where wordToTitleCase []      = []
        wordToTitleCase word
          | word `elem` minors  = wordToLower word
          | otherwise           = wordToCapital word
        minors = words zs
        wordToLower = map toLower
        wordToCapital []     = []
        wordToCapital (y:ys) = toUpper y : map toLower ys
