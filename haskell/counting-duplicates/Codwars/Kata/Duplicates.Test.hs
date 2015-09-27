module Codwars.Kata.Duplicates.Test where
import Codwars.Kata.Duplicates (duplicateCount)
import Data.List (nub)
import Test.Hspec
import Test.QuickCheck

main = hspec $
  describe "duplicateCount" $ do
    it "should work for empty string" $
      duplicateCount ""                         =?= 0
    it "should work for non duplicates" $
      duplicateCount "abcde"                    =?= 0
    it "should work for lower duplicates" $
      duplicateCount "aabbcde"                  =?= 2
    it "should work for case insensitive duplicates" $
      duplicateCount "aaBbcde"                  =?= 2
    it "should work for duplicate count > 2" $
      duplicateCount "Indivisibility"           =?= 1
    it "should work for multiple duplicates" $
      duplicateCount "Indivisibilities"         =?= 2
    it "should work for range" $
      duplicateCount ['a'..'z']                 =?= 0
    it "should work for ranges" $
      duplicateCount (['a'..'z'] ++ ['A'..'Z']) =?= 26
    it "should work for some random lists" $
      property $ forAll (listOf $ elements ['a'..'z']) $ \x ->
        let xs = nub x
        in duplicateCount (concatMap (replicate 2) xs) =?= length xs
  where (=?=) = shouldBe
