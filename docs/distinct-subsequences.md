# Distinct Subsequences

- **对应程序**: `distinct-subsequences/Solution.java`
- **算法**: 动态规划（二维 DP）
- **思路**: `P[i][j]` 表示 S 的前 i+1 个字符中出现 T 的前 j+1 个字符作为子序列的方案数。首列按 `s[i] == t[0]` 累加初始化；转移时若 `t[j] == s[i]`，取用或不取该字符：`P[i][j] = P[i-1][j] + P[i-1][j-1]`，否则 `P[i][j] = P[i-1][j]`。答案在 `P[s.length-1][t.length-1]`。
- **复杂度**: 时间 O(|S| * |T|)，空间 O(|S| * |T|)
