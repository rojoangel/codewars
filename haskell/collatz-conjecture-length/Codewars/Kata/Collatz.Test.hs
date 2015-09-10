module Codewars.Kata.Collatz.Test where
import Codewars.Kata.Collatz (collatz)
import Test.Hspec

main :: IO()
main = hspec $
  describe "collatz length" $
    it "should work for some examples" $ do
      collatz  1 `shouldBe`  1
      collatz  2 `shouldBe`  2
      collatz 15 `shouldBe` 18
      collatz 20 `shouldBe`  8
