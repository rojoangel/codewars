module Codewars.Kata.XO.Test (main) where
import Codewars.Kata.XO (xo)
import Test.Hspec
import Test.QuickCheck

main = hspec $ do
  describe "xo" $ do
    it "should work on some examples" $ do
      expectTrue "xo"
      expectTrue "Xo"
      expectTrue "xxOo"
      expectFalse "xxxm"
      expectFalse "Oo"
      expectFalse "ooom"

    it "should return true for strings that don't contain x or o" $ property $
      forAll (filter (\k -> k `notElem` "xXoO") `fmap` arbitrary) $ \str ->
        expectTrue str

expectFalse, expectTrue :: String -> Expectation
expectTrue s
  | xo s       = return ()
  | otherwise  = expectationFailure $ "Expected True but got False on " ++ show s

expectFalse s
  | not $ xo s = return ()
  | otherwise  = expectationFailure $ "Expected False but got True on " ++ show s
