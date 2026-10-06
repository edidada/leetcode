# Unique Paths

- **对应程序**: `unique-paths/Solution.java`
- **算法**: 动态规划（二维表）
- **思路**: 建立 `m x n` 的 `matrix`，把第一列与第一行都初始化为 1（只有一条直路）。从 `(1,1)` 起按 `matrix[x][y] = matrix[x-1][y] + matrix[x][y-1]` 累加，即每个格子方案数等于上方与左方之和。返回右下角 `matrix[m-1][n-1]`；`m` 或 `n` 为 0 时返回 0。
- **复杂度**: 时间 O(m*n)，空间 O(m*n)
