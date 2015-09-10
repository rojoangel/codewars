module Reverse.Test where
import qualified Reverse
import Test.Hspec
import Test.QuickCheck

main = hspec $ do
  describe "reverse" $ do
    it "should reverse a list of Integers" $ do
      property $ \x -> Reverse.reverse x == reverse (x :: [Integer])
    it "should reverse a string" $ do
      property $ \x -> Reverse.reverse x == reverse (x :: String)
    it "should reverse a list of Maybe Bool" $ do
      property $ \x -> Reverse.reverse x == reverse (x :: [Maybe Bool])
