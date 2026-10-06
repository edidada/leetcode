# Search Insert Position

- **对应程序**: `search-insert-position/Solution.java`
- **算法**: 线性扫描（顺序查找）
- **思路**: 这份实现并未使用二分，而是 `for i = 0..A.length-1` 遍历升序数组，遇到第一个 `A[i] >= target` 立即返回 `i`；若整个数组都小于 `target` 则返回 `A.length` 表示插在末尾。
- **复杂度**: 时间 O(n)，空间 O(1)
