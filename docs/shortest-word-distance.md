# Shortest Word Distance

- **对应程序**: `shortest-word-distance/Solution.java`
- **算法**: 一次遍历双指针（记录最近下标）
- **思路**: 顺序扫描 `words`，分别用 `i1`、`i2` 更新 `word1`、`word2` 的最新出现下标；一旦两者均已被访问（`i1 >= 0 && i2 >= 0`），就用 `Math.abs(i1 - i2)` 更新最小距离 `len`。返回遍历结束后的 `len`。
- **复杂度**: 时间 O(n)，空间 O(1)
