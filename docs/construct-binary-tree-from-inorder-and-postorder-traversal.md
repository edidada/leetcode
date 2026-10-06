# Construct Binary Tree from Inorder and Postorder Traversal

- **对应程序**: `construct-binary-tree-from-inorder-and-postorder-traversal/Solution.java`
- **算法**: 分治（递归建树）
- **思路**: 指针 p 从 postorder 末尾倒序前移，`postorder[p]` 即当前子树根；在 inorder 区间 [st, ed) 中线性扫描找到根的位置 i 来切分左右子树。因为倒序访问，右子树先于左子树构建：`root.right = buildTree(i + 1, ed)`，再 `root.left = buildTree(st, i)`。
- **复杂度**: 时间 O(n^2) 最坏（每层线性查找根位置），空间 O(n)（递归栈与树节点）
