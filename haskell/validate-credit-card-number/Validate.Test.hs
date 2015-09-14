import Validate
import Test.Hspec

main = hspec $ do
  describe "validate" $ do
    it "123 is not valid" $ do
      validate 123 `shouldBe` False
    it "1 is not valid" $ do
      validate 1 `shouldBe` False
    it "2121 is valid" $ do
      validate 2121 `shouldBe` True
