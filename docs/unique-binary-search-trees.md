# Unique Binary Search Trees

- **对应程序**: `unique-binary-search-trees/Solution.java`
- **算法**: 递归（Catalan 数）
- **思路**: `numTrees(n)` 枚举根的位置 `i`（0..n-1），左子树由 `i` 个节点构成、右子树由 `n-1-i` 个节点构成，方案数为两者乘积之和 `s += numTrees(i)*numTrees(n-1-i)`，即卡特兰数递推；`n==0` 返回 1 作为基准。该实现为纯递归、未做记忆化。
- **复杂度**: 时间 O(4^n / n^(3/2))（无记忆化，指数级），空间 O(n)（递归栈）
