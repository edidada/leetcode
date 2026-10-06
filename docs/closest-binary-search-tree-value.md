# Closest Binary Search Tree Value

- **对应程序**: `closest-binary-search-tree-value/Solution.java`
- **算法**: 递归 DFS（全树遍历比较，未利用 BST 剪枝）
- **思路**: 辅助函数 `closestValue(int v1, int v2, double target)` 比较 `Math.abs(target - v1)` 与 `Math.abs(target - v2)`，返回更接近 target 的那个值。主方法以 `int closest = root.val` 起步，若有左子树则 `closest = closestValue(closestValue(root.left, target), closest, target)`，右子树同理，即把子树的最优解与当前节点值两两比较后上传。由于左右子树都递归访问，这份实现是遍历整棵树取最小差值，而不是沿 BST 的有序性单路下降。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，最坏 O(n)）
