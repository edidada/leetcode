# Remove Linked List Elements

- **对应程序**: `remove-linked-list-elements/Solution.java`
- **算法**: 链表递归删除
- **思路**: 递归函数 `removeElements(head, val)`：空节点返回 null；若 `head.val == val` 则丢弃头节点、直接返回 `removeElements(head.next, val)`；否则保留头节点并令 `head.next = removeElements(head.next, val)`。沿着递归返回逐点重建，把值为 `val` 的节点全部摘除。
- **复杂度**: 时间 O(n)，空间 O(n)（递归栈）
