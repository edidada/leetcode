# Factor Combinations

- **对应程序**: `factor-combinations/Solution.java`
- **算法**: 回溯 / 递归分治
- **思路**: `getFactors(n, low, high)` 递归枚举 n 的因子分解：若 `low <= n < high` 则先把 `[n]` 自身作为一种组合加入结果；随后从 `low` 开始试除每个能整除 n 的因子 `i`，对剩余部分 `n/i` 以 `i` 为下界递归（`getFactors(n/i, i, n)`），再把 `i` 前置到每个子解。下界单调不减，从而避免重复组合。
- **复杂度**: 时间 O(组合数 × 平均长度)，与 n 的因子个数相关；空间 O(log n)（递归深度与中间列表）
