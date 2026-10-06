# Reverse Linked List

- **对应程序**: `reverse-linked-list/Solution.java`
- **算法**: 链表递归反转
- **思路**: 递归到表尾返回新头 `reversed`；回溯时利用 `tail = head.next`（反转后的当前段尾），执行 `tail.next = head` 让后继指回自己，再 `head.next = null` 断开旧指向。基准情形为空或单节点。整体自底向上逐节把指针反向。
- **复杂度**: 时间 O(n)，空间 O(n)（递归栈）
