# Candy

- **对应程序**: `candy/Solution.java`
- **算法**: 贪心（左右两遍扫描）
- **思路**: 分配方案用 `int[] candies` 表示，先 `Arrays.fill(candies, 1)` 保证每人至少一颗。第一遍从左到右 `for(i = 1..)`，若 `ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]` 则 `candies[i] = candies[i-1] + 1`，满足「比左邻评分高就比左邻多」；第二遍从右到左 `for(i = length-2 .. 0)` 对称地处理右邻约束，只在 `candies[i] <= candies[i+1]` 时才抬升到 `candies[i+1] + 1`，因此不会破坏左向约束的最优性。最后 `for(int c : candies) s += c` 求和。
- **复杂度**: 时间 O(n)，空间 O(n)
