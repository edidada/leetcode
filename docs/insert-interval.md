# Insert Interval

- **对应程序**: `insert-interval/Solution.java`
- **算法**: 线性查找插入位置 + 合并区间
- **思路**: 输入区间已按 start 有序，先顺序找到第一个 `newInterval.start <= intervals[i].start` 的位置并用 `intervals.add(pos, ...)` 插入（类插入排序）。随后把列表装入 `LinkedList` 当作栈，循环弹出头部两个区间 `i1`、`i2`：若 `i1.end >= i2.start` 则合并为 `Interval(i1.start, max(end))` 压回，否则把 `i1` 输出、`i2` 留待下一轮；最后把剩余元素并入结果。
- **复杂度**: 时间 O(n)，空间 O(n)（结果列表与链表副本）
