# Maximal Rectangle

- **对应程序**: `maximal-rectangle/Solution.java`
- **算法**: 归约为直方图最大矩形 + 单调栈
- **思路**: 把 0/1 矩阵转成 int 后做两个方向的游程聚合：横向令 `_matrix[x][y]` 表示从 (x,y) 向右连续 1 的个数，则固定列 y 时各行的该值构成直方图，用内嵌的 `largestRectangleArea`（单调栈，同 largest-rectangle-in-histogram 的解法）求以 y 为左边界的最优矩形；纵向再做一次对称处理（向上连续 1 个数、逐行跑直方图），取两者最大值。
- **复杂度**: 时间 O(m·n)（直方图算法线性，逐列/逐行各跑一遍）；空间 O(m·n)
