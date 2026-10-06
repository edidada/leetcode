# Flatten Binary Tree to Linked List

- **对应程序**: `flatten-binary-tree-to-linked-list/Solution.java`
- **算法**: DFS（前序遍历）
- **思路**: 用成员变量 `prev` 记录前序遍历的上一个节点。进入每个节点时先保存其左右子节点，若 `prev` 非空则把 `prev.right` 指向当前节点、`prev.left` 置空，然后更新 `prev` 为当前节点，再依次递归左右子树。整体等价于按前序顺序把节点串成只有 right 指针的链表。`flatten` 每次先把 `prev` 重置为 null。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
