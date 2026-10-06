# Kth Largest Element in an Array

- **对应程序**: `kth-largest-element-in-an-array/Solution.java`
- **算法**: 堆（手写大小为 k 的最小堆）
- **思路**: 内部类 `MinHeap` 用数组实现：`add()` 尾部插入后向上交换 `sift-up`，`heapify()` 向下比较左右孩子后 `sift-down`。主函数先把前 k 个元素入堆，之后对每个后续元素，若大于堆顶 `data[0]` 就替换堆顶并 `heapify(0)`。遍历结束时堆里保留最大的 k 个元素，堆顶即第 k 大。
- **复杂度**: 时间 O(n log k)，空间 O(k)
