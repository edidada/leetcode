# Climbing Stairs

- **对应程序**: `climbing-stairs/Solution.java`
- **算法**: 动态规划（斐波那契递推，自底向上填表）
- **思路**: 到第 i 级只能从 i-1 或 i-2 跨上来，故 `step[i] = step[i-1] + step[i-2]`。实现开一个 `int[] step = new int[Math.max(n + 1, 3)]`（避免 n 很小时越界），写入边界 `step[0] = 0; step[1] = 1; step[2] = 2`，再 `for(int i = 3; i <= n; i++)` 递推填表，返回 `step[n]`。
- **复杂度**: 时间 O(n)，空间 O(n)
