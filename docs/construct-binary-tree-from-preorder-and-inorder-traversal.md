# Construct Binary Tree from Preorder and Inorder Traversal

- **对应程序**: `construct-binary-tree-from-preorder-and-inorder-traversal/Solution.java`
- **算法**: 分治（递归建树）
- **思路**: 指针 p 从 preorder 头部正序前移，`preorder[p]` 即当前子树根；在 inorder 区间 [st, ed) 中线性扫描找到根的位置 i。先递归构建左子树 `buildTree(st, i)`（消耗紧随其后的 preorder 元素），再构建右子树 `buildTree(i + 1, ed)`。
- **复杂度**: 时间 O(n^2) 最坏（每层线性查找根位置），空间 O(n)（递归栈与树节点）
