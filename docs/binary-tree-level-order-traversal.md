# Binary Tree Level Order Traversal

- **对应程序**: `binary-tree-level-order-traversal/Solution.java`
- **算法**: BFS（队列 + 层末哨兵）
- **思路**: 标准广度优先遍历，用一个哨兵 `final TreeNode END = new TreeNode(0)` 标记层结束。`Deque<TreeNode> queue` 初始放入 `root` 和 `END`，循环 `queue.poll()`：若弹出的是 `END`，说明当前层收集完，把临时 `level` 拷贝进结果（`rt.add(new ArrayList<Integer>(level))`）、`level.clear()`，队列非空时再补一个 `END`；否则把 `node.val` 加入 `level`，并把非空的 `left`/`right` 依次 `addLast`。root 为 null 时返回空列表。
- **复杂度**: 时间 O(n)，空间 O(n)（队列与结果）
