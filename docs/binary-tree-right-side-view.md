# Binary Tree Right Side View

- **对应程序**: `binary-tree-right-side-view/Solution.java`
- **算法**: 递归 DFS（分治合并子树视图）
- **思路**: 没用 BFS，而是递归构造：根为空返回空列表；否则结果 `rt` 先加入 `root.val`（当前层最右可见的就是本层根），再递归得到 `left = rightSideView(root.left)`、`right = rightSideView(root.right)`，先 `rt.addAll(right)`（右侧视图优先覆盖各层），然后若 `left.size() > right.size()`，说明左侧更深，把 `left.subList(right.size(), left.size())` 这些超出的深层节点补进结果。
- **复杂度**: 时间 O(n)（每个节点常数次列表操作），空间 O(h) 递归栈 + O(n) 结果
