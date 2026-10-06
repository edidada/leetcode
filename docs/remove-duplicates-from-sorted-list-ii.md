# Remove Duplicates from Sorted List II

- **对应程序**: `remove-duplicates-from-sorted-list-ii/Solution.java`
- **算法**: 链表递归（删除全部重复节点）
- **思路**: 递归处理：先看头值 `v`，用 `node` 沿 `node.next.val == v` 的链前进并置 `killme = true` 标记头值有重复。若 `killme`，整个这一组都丢弃，`head` 直接改指向 `deleteDuplicates(node.next)` 的结果；否则保留头节点，令 `head.next = deleteDuplicates(node.next)`。自底向上重建链表，删除所有出现重复的值。
- **复杂度**: 时间 O(n)，空间 O(n)（递归栈）
