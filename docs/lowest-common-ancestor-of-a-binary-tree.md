# Lowest Common Ancestor of a Binary Tree

- **对应程序**: `lowest-common-ancestor-of-a-binary-tree/Solution.java`
- **算法**: DFS（中序遍历 + 子树包含判断）
- **思路**: 中序遍历树，先遇到的目标点记为当前 `root`，另一个记为 `other`；此后对每个祖先节点检查 `root == other || containOther(root.right)`——即另一半目标是否出现在当前子树中，第一个满足的节点就是 LCA，写入 `lca` 后所有递归借助 `lca != null` 提前短路。作者注释也自嘲"a bit ugly"。
- **复杂度**: 时间 O(n)（`containOther` 扫描的子树互不相交，各节点至多被访问常数次）；空间 O(H)
