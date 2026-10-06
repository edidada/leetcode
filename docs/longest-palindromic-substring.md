# Longest Palindromic Substring

- **对应程序**: `longest-palindromic-substring/Solution.java`
- **算法**: 动态规划（按子串长度枚举）
- **思路**: 用 `P[len-1][i]` 记录"从 i 开始、长度为 len 的子串是否回文"。先初始化长度 1 全为 true，再枚举长度 2 比较首尾字符；长度从 3 递增，转移为 `P[len][i] = P[len-2][i+1] && S[i]==S[i+len-1]`（即内缩一格的子串回文且首尾相等），每次命中都更新 `maxi/maxlen`，最后截取子串。
- **复杂度**: 时间 O(n^2)；空间 O(n^2)
