# Paint House

- **对应程序**: `paint-house/Solution.java`
- **算法**: 动态规划（三状态）
- **思路**: 三种颜色用位标志 RED/BLUE/GREEN（0b001/0b010/0b100）表示，`index(color)=color/2` 映射到下标。递推 `minCosts[i][c] = costs[i][c] + min(minCosts[i-1], c)`，其中 `min` 辅助函数用 `~(ALL & exclude)` 掩码排除与上一行同色的选项、在其余两种颜色中取较小值；首行直接初始化为本行代价，答案为末行三种颜色中的最小值（`min(minCosts[n-1], NONE)`）。
- **复杂度**: 时间 O(n)，空间 O(n)（n 行为 3 列表，可滚动优化为 O(1)）
