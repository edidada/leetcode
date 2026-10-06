# Kth Smallest Element in a BST

- **对应程序**: `kth-smallest-element-in-a-bst/Solution.java`
- **算法**: 中序遍历（DFS）+ 提前终止
- **思路**: 利用 BST 中序遍历即升序的性质，`search` 递归先走左子树（越过最左边界时置 `reachLeftMost`），每"访问"一个候选节点就把计数器 `k` 减一；当 `k == 0` 时记录当前节点值到 `kth` 并置 `stop` 标志，使后续递归立即返回，避免遍历整棵树。
- **复杂度**: 时间 O(H + k)，最坏 O(n)；空间 O(H)，H 为树高（递归栈）
