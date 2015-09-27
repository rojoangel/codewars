module Term where
import Data.List

highestRank :: Ord c => [c] -> c
highestRank xs = fst . foldl1 (\acc@(_,y') d@(_,y) -> if y >= y' then d else acc) . map (\l@(x:_) -> (x,length l)) . group . sort $ xs
