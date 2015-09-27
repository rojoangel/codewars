module SquareSum.Test where
import SquareSum
import Test.Hspec

main = hspec $ do
  describe "squareSum" $ do
    it "should work for some examples" $ do
      squareSum [1,2] `shouldBe` 5
      squareSum [5,3,4] `shouldBe` 50
