# Balanced Binary Tree

- **对应程序**: `balanced-binary-tree/Solution.java`
- **算法**: 递归 DFS（自顶向下，重复计算高度）
- **思路**: 按 README 中的定义直接实现：`height(root)` 递归返回 `Math.max(height(left), height(right)) + 1`，空树为 0；`isBalanced(root)` 空树返回 true，否则返回 `Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)` 三个条件的与。由于每个节点都会重新计算子树高度，没有做自底向上的高度/平衡信息合并。
- **复杂度**: 时间 最坏 O(n^2)（退化成链状树时），空间 O(h)（递归栈，h 为树高，最坏 O(n)）
