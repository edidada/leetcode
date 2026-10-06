# Search in Rotated Sorted Array II

- **对应程序**: `search-in-rotated-sorted-array-ii/Solution.java`
- **算法**: 变形二分查找（含重复元素退化处理）
- **思路**: 框架与非重复版一致，仍用 `[s, e)` 左闭右开区间；额外新增“端点与中点同值”的退化分支——当 `A[s] == A[mid]` 且 `A[mid] == A[e-1]` 时无法判断哪半有序，采取 `s++; e--;` 两头收缩；当 `A[s] == A[mid]` 但右端不同值时右半仍有序，可安全令 `s = mid + 1`。`target > A[mid]` 分支对称地判断 `A[mid] == A[e-1]`，用同样策略处理重复。
- **复杂度**: 时间平均 O(log n)，最坏 O(n)（全等元素），空间 O(1)
