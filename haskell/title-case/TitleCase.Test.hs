module TitleCase.Test where
import TitleCase (titleCase)
import Test.Hspec

main :: IO ()
main = hspec $
  describe "titleCase" $ do
    it "should return empty string for empty string in" $ do
      titleCase "" "" `shouldBe` ""
      titleCase "anything a an" "" `shouldBe` ""
    it "given no minors should capitalize all UPPERCASE" $
      titleCase "" "THE WIND IN THE WILLOWS" `shouldBe` "The Wind In The Willows"
    it "given no minors should capitalize all lowercase" $
      titleCase "" "the quick brown fox" `shouldBe` "The Quick Brown Fox"
    it "given no minors should capitalize mixed case" $
      titleCase "" "a clash of KINGS" `shouldBe` "A Clash Of Kings"
    it "given matching minors should capitalize" $
      titleCase "of" "a clash of KINGS" `shouldBe` "A Clash of Kings"
    it "matching minors capitalisation should not be considered" $
      titleCase "OF" "a clash of KINGS" `shouldBe` "A Clash of Kings"
    it "matching minors capitalisation should not be considered" $
      titleCase "of" "a clash OF KINGS" `shouldBe` "A Clash of Kings"
    it "should always capitalize 1st word" $
      titleCase "a" "a clash OF KINGS" `shouldBe` "A Clash Of Kings"
