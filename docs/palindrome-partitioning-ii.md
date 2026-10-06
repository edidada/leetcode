# Palindrome Partitioning II

- **对应程序**: `palindrome-partitioning-ii/Solution.java`
- **算法**: 动态规划（回文预处理表 + 一维最少切割）
- **思路**: 两级 DP。先用按长度枚举的二维表 `P[len-1][i]` 预处理子串 `s[i..i+len-1]` 是否为回文：长度 1 全 true，长度 2 比较相邻字符，更长则 `P[len-3][i+1] && S[i]==S[i+len-1]`（内部子串回文且两端相等）。再用一维 `mincut[len]` 表示前 len 个字符的最少切数：若整段前缀是回文则为 0；否则先取 `mincut[len-1]+1`，并枚举切点 i，当后缀 `s[i..len-1]` 为回文时用 `mincut[i]+1` 更新最小值。答案为 `mincut[S.length]`。
- **复杂度**: 时间 O(n^2)，空间 O(n^2)
