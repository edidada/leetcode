# Minimum Path Sum

- **对应程序**: `minimum-path-sum/Solution.java`
- **算法**: 动态规划（原地滚动）
- **思路**: 直接在输入网格 `grid` 上做 DP：先对第一列做前缀累加 `grid[x][0] += grid[x-1][0]`，再对第一行做前缀累加，然后双重循环填内部格子 `grid[x][y] += Math.min(grid[x-1][y], grid[x][y-1])`，即每个格子累加来自上方与左方的较小路径和，最终返回右下角 `grid[mx-1][my-1]`。
- **复杂度**: 时间 O(mn)，空间 O(1)（原地修改，不计输入占用）
