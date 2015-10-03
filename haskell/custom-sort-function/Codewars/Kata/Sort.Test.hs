module Codewars.Kata.Sort.Test where
import Codewars.Kata.Sort (sort)
import qualified Data.List as L
import Test.Hspec
import Test.QuickCheck

main = hspec $
  describe "custom sort function" $ do
    it "should work for some examples" $ do
      sort []                    `shouldBe` []
      sort [1,3,2]               `shouldBe` [1,2,3]
      sort [1,3,2,3,4,1]         `shouldBe` [1,1,2,3,3,4]
      sort ["abc", "adc", "acc"] `shouldBe` ["abc","acc","adc"]

    it "should work for several random lists" $
      conjoin [ property $ \xs -> sort xs `shouldBe` L.sort (xs :: [Integer])
              , property $ \xs -> sort xs `shouldBe` L.sort (xs :: [Bool])
              , property $ \xs -> sort xs `shouldBe` L.sort (xs :: [Double])
              , property $ \xs -> sort xs `shouldBe` L.sort (xs :: [Char])
              , property $ \xs -> sort xs `shouldBe` L.sort (xs :: [(Char, Int)])
              ]

    it "should not Data.List, Data.Map, Data.Set or other modules with sort functions" $
      hidden [ Module "Data.List"
             , Module "Data.Map"
             , Module "Data.Map.Lazy"
             , Module "Data.Map.Strict"
             , Module "Data.Set"
             , Module "GHC.Exts"
             ]
