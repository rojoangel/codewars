module Codwars.Kata.Duplicates.Test where
import Codwars.Kata.Duplicates (duplicateCount)
import Data.List (nub)
import Test.Hspec
import Test.QuickCheck

main = hspec $ do
  describe "duplicateCount" $ do
    it "should work for some small tests" $ do
      duplicateCount ""                         =?= 0
      duplicateCount "abcde"                    =?= 0
      duplicateCount "aabbcde"                  =?= 2
      duplicateCount "aaBbcde"                  =?= 2
      duplicateCount "Indivisibility"           =?= 1
      duplicateCount "Indivisibilities"         =?= 2
      duplicateCount ['a'..'z']                 =?= 0
      duplicateCount (['a'..'z'] ++ ['A'..'Z']) =?= 26
    it "should work for some random lists" $ do
      property $ forAll (listOf $ elements ['a'..'z']) $ \x ->
        let xs = nub x
        in duplicateCount (concatMap (replicate 2) xs) =?= length xs
  where (=?=) = shouldBe
