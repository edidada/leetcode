# Binary Tree Zigzag Level Order Traversal

- **对应程序**: `binary-tree-zigzag-level-order-traversal/Solution.java`
- **算法**: BFS（队列 + 层末哨兵）+ 方向标志双端插入
- **思路**: 在 [Binary Tree Level Order Traversal](./binary-tree-level-order-traversal.md) 的 `END` 哨兵分层框架上加一个 `boolean direction = true`（true 表示左到右）。当前层容器改为双端队列 `Deque<Integer> level`：`direction` 为真时 `level.addLast(current.val)`，为假时 `level.addFirst(current.val)`，从而在遍历顺序始终是左到右的情况下把偶数层的收集顺序反转。遇到哨兵 `END` 时 `direction = !direction` 换向，并把 `level` 拷贝入结果后清空、队列非空则再补一个 `END`。子节点仍按 `left`、`right` 顺序入队。
- **复杂度**: 时间 O(n)，空间 O(n)
