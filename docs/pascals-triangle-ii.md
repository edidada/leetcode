# Pascal's Triangle II

- **对应程序**: `pascals-triangle-ii/Solution.java`
- **算法**: 动态规划（一维数组原地滚动）
- **思路**: 只开一个长度 `rowIndex+1` 的数组并初始全 1，然后迭代 `rowIndex-1` 轮；每轮内层 `for(int j = i+1; j >= 1; j--)` 从右向左执行 `row[j] = row[j] + row[j-1]`，倒序更新保证用到的是上一轮的旧值，最终数组即第 rowIndex 行（从 0 计）。
- **复杂度**: 时间 O(rowIndex^2)，空间 O(rowIndex)
