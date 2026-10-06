# Interleaving String

- **对应程序**: `interleaving-string/Solution.java`
- **算法**: 动态规划（二维布尔 DP，类似 Unique Paths 走矩阵）
- **思路**: `map[i][j]` 表示 s1 前 i 个字符与 s2 前 j 个字符能否交错组成 s3 前 i+j 个字符。先检查长度和不符直接 false；初始化第一行/第一列（单串逐字符对齐 s3 前缀）。一般转移：若 `map[i-1][j]` 为真则取 `map[i][j] = (s3[i+j-1] == s1[i-1])`，否则若 `map[i][j-1]` 为真则比较 s2 的对应字符。答案在 `map[m][n]`。
- **复杂度**: 时间 O(m·n)，空间 O(m·n)
