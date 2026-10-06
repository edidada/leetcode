# Minimum Depth of Binary Tree

- **对应程序**: `minimum-depth-of-binary-tree/Solution.java`
- **算法**: 递归 DFS（分治）
- **思路**: 递归求最小深度：空树返回 0，叶子节点返回 1；关键在于单侧子树为空时不能取 min，代码分别处理 `left != null && right == null` 与 `left == null && right != null` 两种情况，只对存在的一侧递归加 1；两侧都非空时才 `Math.min(minDepth(left), minDepth(right)) + 1`。
- **复杂度**: 时间 O(n)，空间 O(h)（h 为树高，递归栈）
