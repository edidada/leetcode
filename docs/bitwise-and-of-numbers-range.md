# Bitwise AND of Numbers Range

- **对应程序**: `bitwise-and-of-numbers-range/Solution.java`
- **算法**: 位运算分治递归（按最高公共二进制位）
- **思路**: 静态表 `POW[i] = 2^i` 预处理 32 个幂。`rangeBitwiseAnd(m, n)` 从高位往低位 `for(int i = SIZE; i > 0; i--)` 找 `m` 所在的区间 `[POW[i-1], POW[i])`；若 `n` 也落在同一区间，说明最高位 `POW[i-1]` 在整个范围内保持不变，于是返回 `(int)POW[i-1] | rangeBitwiseAnd(m & (p-1), n & (p-1))`，即保留该位后对去掉最高位的余数递归。若两者不同区间（或 m 为 0 等无匹配情形）循环走完则返回 0。
- **复杂度**: 时间 O(log^2 n)（每层递归扫描 32 个位，递归深度 ≤ 32），空间 O(log n)（递归栈）
