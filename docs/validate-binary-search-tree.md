# Validate Binary Search Tree

- **对应程序**: `validate-binary-search-tree/Solution.java`
- **算法**: 中序遍历（DFS）
- **思路**: 利用 BST 中序遍历应严格递增的性质。成员变量 `last` 记录上一个访问值、`failed` 记录是否已破坏。`inorder` 递归左子树后，若 `last >= root.val` 则置 `failed=true`，随后更新 `last=root.val` 再递归右子树（`failed` 为真时提前剪枝）。`isValidBST` 将 `last` 初始化为 `Integer.MIN_VALUE` 后触发遍历，返回 `!failed`；空树返回 `true`。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈）
