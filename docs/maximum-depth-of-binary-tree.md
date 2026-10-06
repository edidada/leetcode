# Maximum Depth of Binary Tree

- **对应程序**: `maximum-depth-of-binary-tree/Solution.java`
- **算法**: DFS（递归分治）
- **思路**: 直接按定义递归：空节点深度为 0，否则深度为左右子树最大深度的递归值加 1，即 `max(maxDepth(left), maxDepth(right)) + 1`。
- **复杂度**: 时间 O(n)；空间 O(H)，最坏 O(n)（递归栈）
