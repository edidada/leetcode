# N-Queens II

- **对应程序**: `n-queens-ii/Solution.java`
- **算法**: 回溯（逐行 DFS + 剪枝）
- **思路**: 与 N-Queens 的 Solution 完全同构：`chessboard` 上逐行尝试，`tryput` 向上检查列与两条对角线冲突，`search(row+1)` 递归并回溯撤销。区别在于到达 `row > target` 的完整解时不记录棋盘，只做计数器 `rt++`，最终 `totalNQueens` 返回解的总数。
- **复杂度**: 时间 O(n!)，空间 O(n^2)（棋盘与递归栈）
