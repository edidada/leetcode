# Find Minimum in Rotated Sorted Array

- **对应程序**: `find-minimum-in-rotated-sorted-array/Solution.java`
- **算法**: 二分查找（递归）
- **思路**: 对区间取中点 `m`，按端点与中点的大小关系分三种情况：`s < m < e`（区间未旋转，直接返回 `num[s]`）、`s < m > e`（最小值在右半，递归 `[m, e)`）、`s > m < e`（最小值在左半，递归 `[s, m+1)`）。长度为 1 或 2 时直接返回。子问题用 `Arrays.copyOfRange` 切片实现。
- **复杂度**: 时间 O(log n) 层递归，但数组切片使总拷贝量达 O(n)；空间 O(n)（切片副本）
