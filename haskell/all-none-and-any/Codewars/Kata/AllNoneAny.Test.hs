module Codewars.Kata.AllNoneAny.Test where
import qualified Codewars.Kata.AllNoneAny as A
import Test.Hspec

main = hspec $ do
  describe "all" $ do
    it "should work for some small examples" $ do
      A.all (>0) [1..5]  `shouldBe` True
      A.all (<2) [1..5]  `shouldBe` False
    it "should work for infinite lists" $ do
      A.all (>0) [5,4..] `shouldBe` False
  describe "any" $ do
    it "should work for some small examples" $ do
      A.any (>2) [1..5]   `shouldBe` True
      A.any (<2) [5..9]   `shouldBe` False
    it "should work for infinite lists" $ do
      A.all (>0) [5,4..]  `shouldBe` False
  describe "none" $ do
    it "should work for some small examples" $ do
      A.none (>5) [1..5]   `shouldBe` True
      A.none (>0) [1..5]   `shouldBe` False
    it "should work on infinite lists" $ do
      A.none (>0) [1..]    `shouldBe` False
  describe "hidden modules" $ do
    it "shouldn't use any forbidden modules or functions" $ do
      hidden
        [ FromModule "Prelude" "any"
        , FromModule "Prelude" "all"
        , Module "Data.List"
        , Module "Data.Foldable"
        ]
