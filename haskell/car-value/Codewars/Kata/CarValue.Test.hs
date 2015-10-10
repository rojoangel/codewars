module Codewars.Kata.CarValue.Test where
import Codewars.Kata.CarValue (car)
import Test.Hspec
import Test.QuickCheck

main = hspec $
  describe "car depreciation" $ do
    it "should return 8000.00 for a 10000 valued car 1 year depreciation" $
      car 10000 1 =?= "8000.00"
    it "should return 3635.84 for a 5681 valued car 2 years depreciation" $
      car 5681 2 =?= "3635.84"
    it "should return 6400.63 for a 10000.99 valued car 2 years depreciation" $
      car 10000.99 2 =?= "6400.63"
    it "should return 4608.00 for a 8000 valued car 3 years depreciation" $
      car 8000 3 =?= "4608.00"
    it "should return 35365.25 for a 75800 valued car 5 years depreciation" $
      car 75800 5 =?= "35365.25"
    it "should return 518400.00 for a 1000000 valued car 4 years depreciation" $
      car 1000000 4 =?= "518400.00"
  where (=?=) = shouldBe
