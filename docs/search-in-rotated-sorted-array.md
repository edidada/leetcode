# Search in Rotated Sorted Array

- **对应程序**: `search-in-rotated-sorted-array/Solution.java`
- **算法**: 变形二分查找
- **思路**: 维护左闭右开区间 `[s, e)`，每次取 `mid`；当 `target < A[mid]` 时，用 `A[s] <= A[mid] && A[s] <= target` 或 `A[mid] <= A[e-1]` 判断 target 是否可能落在左半，收缩 `e = mid`；反之 `target > A[mid]` 时，用 `A[mid] <= A[e-1] && target <= A[e-1]` 或 `A[s] <= A[mid]` 判断是否落在右半，令 `s = mid + 1`。通过区分“正常半区”与“跨断点异常半区”保证每步砍掉一半。
- **复杂度**: 时间 O(log n)，空间 O(1)
