# Same Tree

- **对应程序**: `same-tree/Solution.java`
- **算法**: 二叉树递归 DFS
- **思路**: 先处理两棵子树都为空（返回 `true`）与仅一棵为空（返回 `false`）的边界；否则同时比较当前节点值 `p.val == q.val`，并递归调用 `isSameTree` 检查左、右子树，用短路 `&&` 连接三者。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
