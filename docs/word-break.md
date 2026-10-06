# Word Break

- **对应程序**: `word-break/Solution.java`
- **算法**: 动态规划（一维布尔表）
- **思路**: `boolean[] P`，`P[k]` 表示前缀 `s[0..k)` 能否被切分，`P[0]=true`。外层 `i` 枚举右端点，内层 `j` 枚举切点：若 `P[j]` 为真且子串 `new String(S, j, i-j+1)` 在 `dict` 中，则置 `P[i+1]=true`。最终返回 `P[S.length]`。
- **复杂度**: 时间 O(n^3)（双重循环加子串构造/查表），空间 O(n)
