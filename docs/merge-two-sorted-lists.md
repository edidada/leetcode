# Merge Two Sorted Lists

- **对应程序**: `merge-two-sorted-lists/Solution.java`
- **算法**: 链表双指针归并
- **思路**: 创建哑节点 `rt = new ListNode(0)` 作为结果链表头部，用 while 循环同时遍历 l1、l2，每次把值较小的节点直接挂到 `rt.next` 并前移对应指针；一条链走完后，将剩余的另一条链整体接到尾部（`if(l1 != null) rt.next = l1; else rt.next = l2;`），最后返回 `h.next`。
- **复杂度**: 时间 O(m+n)，空间 O(1)
