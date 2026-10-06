# Unique Paths II

- **对应程序**: `unique-paths-ii/Solution.java`
- **算法**: 动态规划（原地覆盖输入网格）
- **思路**: 直接复用 `obstacleGrid` 作为 DP 表。先判起点或终点为障碍直接返回 0。沿第一列、第一行扫描，用 `blocked` 标记一旦遇到障碍其后全置 0，否则置 1；再把 `grid[0][0]` 设为 1。逐格转移：为障碍置 0，否则 `grid[x][y] = grid[x-1][y] + grid[x][y-1]`。返回右下角值。
- **复杂度**: 时间 O(m*n)，空间 O(1)（原地修改）
