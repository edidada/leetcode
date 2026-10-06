# Search a 2D Matrix II

- **对应程序**: `search-a-2d-matrix-ii/Solution.java`
- **算法**: 二维分治递归（四分象限）
- **思路**: 对子矩阵 `[stX..edX) × [stY..edY)` 取左上角 `matrix[stX][stY]` 与右下角 `matrix[edX-1][edY-1]` 作为该区域的极值，若 `target` 落在 `[min, max]` 之外直接剪掉；否则以中点 `(mdX, mdY)` 将区域切成四个子象限，命中中心即返回，否则对四个象限依次递归。
- **复杂度**: 时间 O((m·n)^{log_4 3}) ≈ O(n^{0.79})（分治四路归一），空间 O(log(max(m,n))) 递归栈
