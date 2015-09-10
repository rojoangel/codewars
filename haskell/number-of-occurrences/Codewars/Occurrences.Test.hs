module Codewars.Occurrences.Test where
import Codewars.Occurrences (numberOfOccurrences)
import Test.Hspec

main = hspec $
  describe "numberOfOccurrences" $ do
    it "should work on the empty list" $
        numberOfOccurrences (9 :: Int) [] `shouldBe` 0
    it "should work for some examples" $ do
      let sample = [4, 0, 4]
      numberOfOccurrences 4 sample `shouldBe` 2
      numberOfOccurrences 0 sample `shouldBe` 1
      numberOfOccurrences 1 sample `shouldBe` 0
