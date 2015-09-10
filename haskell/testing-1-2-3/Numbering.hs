module Numbering where

number :: [String] -> [String]
number = zipWith prependLineNum [1..]
  where prependLineNum i x = show i ++ ": " ++ x
