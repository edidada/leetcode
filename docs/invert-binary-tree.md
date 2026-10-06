# Invert Binary Tree

- **对应程序**: `invert-binary-tree/Solution.java`
- **算法**: DFS（递归）
- **思路**: 空节点返回 null；否则递归调用 `invertTree(root.right)` 得到翻转后的右子树作为新左孩子，递归 `invertTree(root.left)` 作为新右孩子，交换赋值后返回 root。即每层递归完成左右子树翻转并互换。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
