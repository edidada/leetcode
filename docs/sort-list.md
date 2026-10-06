# Sort List

- **对应程序**: `sort-list/Solution.java`
- **算法**: 链表归并排序（快慢指针找中点 + 有序合并）
- **思路**: `sortList` 对空表或单节点表直接返回；否则用 `fast = head.next, slow = head` 的快慢指针找到前半段末尾，令 `h2 = slow.next` 并 `slow.next = null` 断链，递归排序两半后调用 `mergeTwoLists`——后者用哨兵 `ListNode(0)` 起头，按 `l1.val < l2.val` 依次接小者，收尾时把未消耗的那条链直接接上。
- **复杂度**: 时间 O(n log n)，空间 O(log n)（递归栈，节点本身不额外分配）
