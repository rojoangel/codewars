import Hamming (hamming)
import Test.Hspec

main = hspec $ do
  describe "hamming" $ do
    it "should return three" $ do
      hamming "I like turtles" "I like turkeys" `shouldBe` 3
    it "should return zero" $ do
      hamming "Hello World" "Hello World" `shouldBe` 0
    it "should return seven" $ do
      hamming "Hello Haskell" "Hello World!!" `shouldBe` 7
