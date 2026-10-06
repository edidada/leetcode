# Binary Tree Paths

- **对应程序**: `binary-tree-paths/Solution.java`
- **算法**: 递归 DFS（分治 + Stream 字符串映射）
- **思路**: 递归返回子树的路径字符串列表：空节点返回空列表；`root.left == null && root.right == null` 的叶子返回单元素列表 `Arrays.asList("" + root.val)`。非叶节点分别对左、右子树调用 `binaryTreePaths`，再用辅助方法 `merge(v, subPath)` 通过 `subPath.stream().map(p -> v + "->" + p)` 给每条子路径加上当前节点前缀，结果 `path.addAll(...)` 合并。
- **复杂度**: 时间 O(n · h)（每条路径字符串需重新构造），空间 O(n · h)（路径集合与递归栈）
