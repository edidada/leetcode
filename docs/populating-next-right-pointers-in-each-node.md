# Populating Next Right Pointers in Each Node

- **对应程序**: `populating-next-right-pointers-in-each-node/Solution.java`
- **算法**: DFS（利用完全二叉树性质的递归连接）
- **思路**: 针对完美二叉树：`connect` 中先令 `root.left.next = root.right`（同父兄弟），再利用父节点已有的 `next` 指针令 `root.right.next = root.next.left`（跨父表兄弟），然后递归处理左右子树。由于父层 `next` 在子层使用前已连好，一遍 DFS 即可完成全部连接，只改节点指针、不用额外队列。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
