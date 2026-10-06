# Combination Sum

- **对应程序**: `combination-sum/Solution.java`
- **算法**: 回溯（DFS）
- **思路**: 先将 candidates 排序，用成员数组 `stack[i]` 记录第 i 个候选数被选取的个数。`search(sp, cur)` 对当前候选 `candidates[sp]` 枚举选取个数 i（满足 `cur + toadd * i <= target` 即可重复选取），递归处理下一个候选；当 `cur == target` 时按 stack 中的个数展开成一个组合加入结果集。
- **复杂度**: 时间 O(指数级，取决于解空间大小)，空间 O(n)（n 为候选数个数，递归深度与 stack 数组）
