# Edit Distance

- **对应程序**: `edit-distance/Solution.java`
- **算法**: 动态规划（Levenshtein 编辑距离）
- **思路**: `P[i][j]` 为 word1 前 i 个字符变成 word2 前 j 个字符的最少操作数，边界 `P[i][0] = i`、`P[0][j] = j`。转移先取删除/插入中较小者加一：`min(P[i-1][j], P[i][j-1]) + 1`；若 `w1[i-1] == w2[j-1]` 则替换代价为 `P[i-1][j-1]`（直接相等），否则为 `P[i-1][j-1] + 1`，两者取 min。
- **复杂度**: 时间 O(m * n)，空间 O(m * n)
