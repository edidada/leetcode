# Sudoku Solver

- **对应程序**: `sudoku-solver/Solution.java`
- **算法**: 回溯 DFS（候选集剪枝）
- **思路**: `_solveSudoku` 顺序扫描棋盘，遇到第一个 `'.'` 时先取全体 `1..9` 的 `VALID`，减去同行 `board[x][*]`、同列 `board[*][y]` 以及所属 3×3 宫（用 `sx = x/3*3, sy = y/3*3` 起点 + `offset` 展开）中出现过的数字得到候选集；然后依次填入候选并调用 `isValidSudoku` 做整盘查重（HashSet 检查行、列、宫），通过就递归下一空格；失败就回溯 `board[x][y] = '.'`。若候选耗尽直接返回 `false` 让上一层快速失败，全盘无 `'.'` 则返回 `true`。
- **复杂度**: 时间 O(9^d)（d 为空格数，最坏指数级），空间 O(d) 递归栈
