# Inorder Successor in BST

- **对应程序**: `inorder-successor-in-bst/Solution.java`
- **算法**: BST 性质 + 递归查找
- **思路**: 若当前节点就是目标 `p`，其后继是右子树的最左节点（辅助函数 `leftMost` 一路往左走）。若 `p.val < root.val`，先递归在左子树中找；左子树找不到（返回 null）时，当前 root 即为后继（回溯时第一个大于 p 的祖先）。否则递归进右子树。
- **复杂度**: 时间 O(h)（h 为树高，退化链表时 O(n)），空间 O(h)（递归栈）
