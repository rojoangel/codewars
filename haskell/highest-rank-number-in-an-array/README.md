### Description:

Write a method ```highestRank(arr)``` (or ```highest-rank``` in clojure) which returns the number which is most frequent in the given input array (or ```ISeq```). If there is a tie for most frequent number, return the largest number of which is most frequent.

Example:
```
let arr1 = [12, 10, 8, 12, 7, 6, 4, 10, 12] in
  highestRank arr1
-- => 12

let arr2 = [12, 10, 8, 12, 7, 6, 4, 10, 12, 10] in
  highestRank arr2
-- => 12

let arr3 = [12, 10, 8, 8, 3, 3, 3, 3, 2, 4, 10, 12, 10] in
  highestRank arr3
-- => 3
```
