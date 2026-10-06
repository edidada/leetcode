# Combinations

- **对应程序**: `combinations/Solution.java`
- **算法**: 回溯（DFS）
- **思路**: 构造 1~n 的数组 num，用 `stack[p]` 记录组合第 p 个位置的取值。`search(p)` 枚举所有数字，若 `p > 0 && n <= stack[p - 1]` 则跳过（强制组合内严格递增以避免重复排列）；当 p 达到 k 时把当前 stack 快照加入结果。
- **复杂度**: 时间 O(k * C(n, k))，空间 O(k)（不算输出；每层循环全量扫描 n，实现较朴素）
