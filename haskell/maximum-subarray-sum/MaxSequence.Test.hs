module MaxSequence.Test where
import MaxSequence
import Test.Hspec

main = hspec $ do
  describe "maxSequence" $ do
    it "Should work on empty list "
     $ do maxSequence [] `shouldBe` 0
    it  "Should work for the example"
     $ do maxSequence input3 `shouldBe` expected3
  where
    input3     = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    expected3  = 6
