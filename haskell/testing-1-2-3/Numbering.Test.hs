module Numbering.Test where
import Numbering (number)
import Test.Hspec
import Test.QuickCheck

main = hspec $ do
  describe "number" $ do
    it "should work for some examples" $ do
      number [] `shouldBe` []
      number ["a", "b", "c"] `shouldBe` ["1: a", "2: b", "3: c"]
