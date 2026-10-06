# Binary Tree Upside Down

- **对应程序**: `binary-tree-upside-down/Solution.java`
- **算法**: 中序遍历 DFS + 队列重挂
- **思路**: 作者发现翻转结果恰好等价于一次中序遍历的产物，于是先用成员变量 `LinkedList<TreeNode> queue` 收集节点：`inOrder(root)` 先递归左子树，然后 `queue.add(root)`，若 `root.left != null` 再把 `root.right` 作为下一组的「左孩子」入队，同时把原节点的 `left/right` 置 null（代码注释自陈这是 bad side effect）。最后 `queue.poll()` 得到新根 `newRoot`，循环 `root.right = queue.poll(); root.left = queue.poll(); root = root.right` 成对取出节点重新连接，形成新的链状树。
- **复杂度**: 时间 O(n)，空间 O(n)（队列 + 递归栈）
