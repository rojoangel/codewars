module Codwars.Kata.Duplicates where

import Data.List
import Data.Char (toLower)

duplicateCount :: String -> Int
duplicateCount = length . filter ((/= 1) . length) . group . sort . map toLower
