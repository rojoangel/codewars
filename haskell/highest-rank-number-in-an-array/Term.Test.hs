import Term
import Test.Hspec

main = hspec $ do
  describe "Basic Tests" $ do
    it "[12, 10, 8, 12, 7, 6, 4, 10, 12]" $ do
      highestRank [12, 10, 8, 12, 7, 6, 4, 10, 12] `shouldBe` 12

    it "[12, 10, 8, 12, 7, 6, 4, 10, 10]" $ do
      highestRank [12, 10, 8, 12, 7, 6, 4, 10, 10] `shouldBe` 10

    it "[12, 10, 8, 12, 7, 6, 4, 10, 12, 10]" $ do
      highestRank [12, 10, 8, 12, 7, 6, 4, 10, 12, 10] `shouldBe` 12

    it "[12, 10, 8, 8, 3, 3, 3, 3, 2, 4, 10, 12, 10]" $ do
      highestRank [12, 10, 8, 8, 3, 3, 3, 3, 2, 4, 10, 12, 10] `shouldBe` 3
