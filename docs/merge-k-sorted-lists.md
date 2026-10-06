# Merge k Sorted Lists

- **对应程序**: `merge-k-sorted-lists/Solution.java`
- **算法**: 分治（两两归并）
- **思路**: 基于 `mergeTwoLists`（哨兵头节点 + 逐比较接链的经典双路归并），`mergeKLists` 对列表集合递归对半拆分：`subList(0, size/2)` 与 `subList(size/2, size)` 各自归并后再合并两条结果；0/1/2 条列表时直接处理作为递归出口。
- **复杂度**: 时间 O(N log k)，N 为节点总数；空间 O(log k)（递归栈，subList 为视图不复制）
