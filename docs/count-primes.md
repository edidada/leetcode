# Count Primes

- **对应程序**: `count-primes/Solution.java`
- **算法**: 埃拉托斯特尼筛法（BitSet）
- **思路**: 用 `BitSet b` 标记合数，先置 0、1 为已标记。外层从 2 开始用 `b.nextClearBit(p + 1)` 跳到下一个未标记（即质数）p，内层把 p 的所有倍数 `p * i < n` 置位；最后 `b.flip(0, n)` 取反，`cardinality()` 即为小于 n 的质数个数。
- **复杂度**: 时间 O(n log log n)，空间 O(n)
