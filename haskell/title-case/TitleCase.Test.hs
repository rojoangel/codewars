module TitleCase.Test where
import TitleCase (titleCase)
import Test.Hspec

main :: IO ()
main = hspec $
  describe "titleCase" $
    it "should return empty string for empty string in" $ do
      titleCase "" "" `shouldBe` ""
      titleCase "anything a an" "" `shouldBe` ""
