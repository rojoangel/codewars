module TitleCase (titleCase) where

import qualified Data.Char as Char

titleCase :: String -> String -> String
titleCase _ xs = unwords . map toTitleCase $ words xs
  where toTitleCase []      = []
        toTitleCase (y:ys)  = Char.toUpper y : map Char.toLower ys
