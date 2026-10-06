# Merge Intervals

- **对应程序**: `merge-intervals/Solution.java`
- **算法**: 排序 + 栈式合并
- **思路**: 先按 `start` 排序，把区间装入链表栈 `s`；反复弹出最上面两个 `i1`、`i2`，若 `i1.end >= i2.start` 则合并为 `new Interval(i1.start, max(end))` 压回，否则 `i1` 已定型写入结果 `rt`、`i2` 压回；栈中剩一个元素时并入结果。
- **复杂度**: 时间 O(n log n)；空间 O(n)
