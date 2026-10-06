# Lowest Common Ancestor of a Binary Search Tree

- **对应程序**: `lowest-common-ancestor-of-a-binary-search-tree/Solution.java`
- **算法**: BST 性质 + 迭代下降
- **思路**: 先递归交换参数保证 `p.val <= q.val`，然后沿树迭代：只要不满足 `p.val <= root.val <= q.val`，`root` 偏大就走左子树、偏小就走右子树。第一个落在 `[p, q]` 区间内的节点即为最近公共祖先。
- **复杂度**: 时间 O(H)，最坏 O(n)；空间 O(1)（不含交换参数时的递归开销）
