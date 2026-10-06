# Rectangle Area

- **对应程序**: `rectangle-area/Solution.java`
- **算法**: 几何计算（容斥：两矩形面积和减重叠面积）
- **思路**: `computeArea` 先通过参数交换保证第一个矩形更靠左（`A <= E`）。面积和 `a` 为两矩形面积相加；若水平不相交（`C < E`）或垂直不相交（`B > H || F > D`）直接返回 `a`；否则减去重叠矩形面积 `area(E, max(B,F), min(C,G), min(D,H))`。辅助函数 `area` 即宽高乘积。
- **复杂度**: 时间 O(1)，空间 O(1)
