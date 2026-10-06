# Recover Binary Search Tree

- **对应程序**: `recover-binary-search-tree/Solution.java`
- **算法**: 中序遍历（BST）+ 记录逆序对
- **思路**: 成员 `last` 保存中序上前一个节点，`bad[2]` 记录两个被交换的节点。中序遍历 `inorder` 中一旦发现 `last.val > root.val`，就把 `bad[0]` 设为当前节点 `root`，并仅在第一次违例时把 `bad[1]` 设为 `last`（这样相邻交换与不相邻交换两种情况都能覆盖，`bad[0]` 会被第二次违例刷新）。遍历结束后直接交换 `bad[0]`、`bad[1]` 的值恢复 BST。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
