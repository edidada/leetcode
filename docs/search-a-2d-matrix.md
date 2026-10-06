# Search a 2D Matrix

- **对应程序**: `search-a-2d-matrix/Solution.java`
- **算法**: 二分查找（一维映射）
- **思路**: 将行列有序的二维矩阵按 `x = m / my, y = m % my` 展平成一维有序序列；对区间 `[0, mx*my)` 做标准左闭右开二分 `while(l < r)`，中点 `m = (r + l) / 2`，命中返回 `true`，小于目标则 `l = m + 1`，否则 `r = m`。
- **复杂度**: 时间 O(log(m·n))，空间 O(1)
