# Binary Tree Maximum Path Sum

- **对应程序**: `binary-tree-maximum-path-sum/Solution.java`
- **算法**: 后序 DFS（自底向上贡献值 + 全局最大值）
- **思路**: 成员变量 `max` 记录答案，`maxPathSum` 先置 `max = Integer.MIN_VALUE` 再调用递归 `sum(root)`。`sum` 分别递归求左右子树的贡献 `left`、`right`，并用 `Math.max(left, 0)`、`Math.max(right, 0)` 把负贡献截断为 0（即不选该侧）；经过当前节点「拐弯」的路径和为 `root.val + left + right`，用它刷新全局 `max`；而返回给父节点的只能是一条直上直下的分支，所以返回 `Math.max(left, right) + root.val`。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，最坏 O(n)）
