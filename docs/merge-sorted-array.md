# Merge Sorted Array

- **对应程序**: `merge-sorted-array/Solution.java`
- **算法**: 归并（逆向双指针）
- **思路**: 归并排序核心操作。`pa`、`pb` 分别指向 A、B 有效部分的末尾，`t` 从 `A.length - 1` 倒着填：比较 `safe(A, pa)` 与 `safe(B, pb)`（pa 越界返回 `Integer.MIN_VALUE` 使 B 优先），把较大者写入 `A[t]` 并移动相应指针，直至填满整个 A。从后往前避免覆盖未处理的元素。
- **复杂度**: 时间 O(m+n)；空间 O(1)
