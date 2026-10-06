# Combination Sum II

- **对应程序**: `combination-sum-ii/Solution.java`
- **算法**: 回溯（DFS）+ 哈希去重
- **思路**: 与 Combination Sum 相同的排序 + `stack` 记录选取个数的框架，但每个候选数最多选一次（循环条件加了 `i <= 1`）。由于输入可能含重复数值，找到一个组合后将其 `toString()` 作为 uid 放入 `HashSet<String> block` 去重，仅当未出现过才加入结果。
- **复杂度**: 时间 O(指数级，最坏 2^n 个子集)，空间 O(n + D)（D 为去重集合大小）
