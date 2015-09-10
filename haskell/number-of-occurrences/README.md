The numberOfOccurrences function must return the number of occurrences of an element in an array.

```haskell
let sample = [0,1,2,2,3]
numberOfOccurrences 0 sample `shouldBe` 1
numberOfOccurrences 4 sample `shouldBe` 0
numberOfOccurrences 2 sample `shouldBe` 2
```
