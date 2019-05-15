# Array Reduction

Anna has a list of n integers called num. She can reduce the list by 1 element by performing a move. Each move consists of the following three steps:

Pick two different elements `num[i]` and `num[j]`, `i ≠ j`.
Remove the two selected elements from the list.
Add the sum of the two selected elements to the end of the list.

Each move has a cost associated with it, and this cost is equal to the sum of the two elements removed from the list during the move. Anna wishes to calculate the minimum total cost of reducing her list to one element.

For example, consider the list `num = [4,6,8]`. Anna removes 4 and 6 in her first move at a cost of `4 + 6 = 10`, and the resultant list is `num1 = [8,10]`. She then removes 8 and 10 in her second move at a cost of `8 + 10 = 18`, and the resultant list is `num2 = [18]`. The total cost of reducing this list to one element using this sequence of moves is `10 + 18 = 28`. This is just one set of possible moves. For instance, she could have started with 4 and 8.

##### Function Description
Complete the function reductionCost. The function must return the minimum total cost of reducing the input list to one element.

##### Method Signature
```java
int reductionCost(List<Integer> num);
```

##### Constraints
```
2 ≤ n ≤ 104
0 ≤ num[i] ≤ 105
```

##### Sample 0

```java
int result = reductionCost(Arrays.asList(1, 2, 3));
// result is 9
```
##### Explanation 0
Anna makes the following moves to reduce the list num = [1, 2, 3]:
* Removes 1 and 2 at cost1 = 1 + 2 = 3, resulting in num1 = [3, 3].
* Removes 3 and 3 at cost2 = 3 + 3 = 6, resulting in num2 = [6].
* When we sum up the cost of each reduction, we get 3 + 6 = 9.

##### Sample 1

```java
int result = reductionCost(Arrays.asList(1, 2, 3, 4));
// result is 19
```

##### Explanation 1

Anna makes the following moves to reduce the array num = [1, 2, 3, 4]:
* Removes 1 and 2 at cost1 = 1 + 2 = 3, resulting in num1 = [3, 4, 3].
* Removes 3 and 3 at cost2 = 3 + 3 = 6, resulting in num2 = [4, 6].
* Removes 4 and 6 at cost3 = 4 + 6 = 10, resulting in num3 = [10].
* When we sum up the cost of each reduction, we get 3 + 6 + 10 = 19.
