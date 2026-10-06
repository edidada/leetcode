# Number of Islands

- **对应程序**: `number-of-islands/Solution.java`
- **算法**: DFS（洪水填充 / 连通块计数）
- **思路**: 维护 `visited` 布尔矩阵。双重循环扫描每个格子，若 `allowed`（越界检查通过、`grid[x][y] == '1'` 且未访问）则从该点发起 `travel` 递归：标记已访问，并对上下左右四个方向继续扩散淹没整座岛；外层每发起一次 `travel` 就让 `count++`，最终 count 即岛屿数。
- **复杂度**: 时间 O(mn)，空间 O(mn)（visited 数组与递归栈）
