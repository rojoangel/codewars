module Term where
import Data.List

highestRank :: Ord c => [c] -> c
highestRank xs = fst . foldl1 (\acc@(x',y') d@(x,y) -> if y >= y' then d else acc) . map (\l@(x:xs) -> (x,length l)) . group . sort $ xs
