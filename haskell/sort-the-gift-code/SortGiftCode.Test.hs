module SortGiftCode.Test where
import SortGiftCode (sortGiftCode)
import Test.Hspec

main = hspec $ do
  describe "sortGiftCode" $ do
    it "should work on the examples" $ do
      sortGiftCode "abcdef"                     `shouldBe` "abcdef"
      sortGiftCode "pqksuvy"                    `shouldBe` "kpqsuvy"
      sortGiftCode "zyxwvutsrqponmlkjihgfedcba" `shouldBe` "abcdefghijklmnopqrstuvwxyz"
