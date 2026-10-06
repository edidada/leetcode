# Set Matrix Zeroes

- **对应程序**: `set-matrix-zeroes/Solution.java`
- **算法**: 原地标记（首行/首列作 bitmap）
- **思路**: 先用两个布尔 `xfz`、`yfz` 分别扫描第 0 列和第 0 行是否已含 0 并单独记录；然后从 `(1,1)` 起遍历内部，若 `matrix[x][y]==0` 就在 `matrix[x][0]` 与 `matrix[0][y]` 打标；再按首列/首行标记把对应整行或整列清零；最后依据 `xfz`、`yfz` 决定是否清零首行首列，从而只用 O(1) 额外空间完成。
- **复杂度**: 时间 O(m·n)，空间 O(1)
