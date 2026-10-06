# N-Queens

- **对应程序**: `n-queens/Solution.java`
- **算法**: 回溯（逐行 DFS + 剪枝）
- **思路**: 用 `boolean[n][n]` 棋盘逐行搜索：`search(row)` 在第 row 行枚举每一列，`tryput` 只向上检查同列与两条对角线（按行距 offset 反推列位）是否有已放置的皇后；可行则落子并递归 `search(row + 1)`，回溯时撤销。当 `row > target` 表示 n 行全部放完，把棋盘转换成 'Q'/'.' 字符串数组加入结果列表 `rt`。
- **复杂度**: 时间 O(n!)（逐行剪枝的排列级搜索），空间 O(n^2)（棋盘与递归栈）
