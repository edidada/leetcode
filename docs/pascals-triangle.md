# Pascal's Triangle

- **对应程序**: `pascals-triangle/Solution.java`
- **算法**: 动态规划（逐行递推）
- **思路**: 逐行构造：第 i 行用长度为 i 的 `Integer[] row`，两端 `row[0]`、`row[i-1]` 置 1，中间每个位置由上一行数组 `prev` 递推 `row[j] = prev[j] + prev[j-1]`；每行转成 ArrayList 加入结果 `rt`，并把当前行存为下一轮的 `prev`。
- **复杂度**: 时间 O(numRows^2)，空间 O(numRows^2)（即输出本身，额外辅助仅一个 prev 行）
