# Missing Ranges

- **对应程序**: `missing-ranges/Solution.java`
- **算法**: 区间扫描（一次遍历）
- **思路**: 维护内部 Range 类表示当前待报告的缺口 `[start, end]`，初始为 `[lower, upper]`。按升序遍历数组 A：跳过超过 `current.end` 的元素；对落在缺口内的 `A[i]`，切出缺口片段 `Range(current.start, A[i]-1)`，若 `end >= start` 有效就按 "x" 或 "x->y" 格式加入结果，然后把 `current.start` 推进到 `A[i] + 1`。遍历结束后把剩余 `current` 也加入结果。
- **复杂度**: 时间 O(n)，空间 O(k)（k 为缺口个数，不计输出）
