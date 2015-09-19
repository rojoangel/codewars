module TitleCase (titleCase) where

import qualified Data.Char as Char

titleCase :: String -> String -> String
titleCase zs xs = unwords . map toTitleCase $ words xs
  where toTitleCase []      = []
        toTitleCase word@(y:ys)
          | word `elem` minors  = map Char.toLower word
          | otherwise         = Char.toUpper y : map Char.toLower ys
        minors = words zs
