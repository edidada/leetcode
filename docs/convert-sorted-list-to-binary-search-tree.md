# Convert Sorted List to Binary Search Tree

- **对应程序**: `convert-sorted-list-to-binary-search-tree/Solution.java`
- **算法**: 分治 + 快慢指针找中点
- **思路**: `cutatmid` 用快慢指针找到链表中间节点 slow，并用 pslow 在中间节点前断链（`pslow.next = null`），把链表切成左半与中点+右半。以中点值为根，对断开的左半 `head` 和 `mid.next` 递归建树，保证 BST 平衡。
- **复杂度**: 时间 O(n log n)（每层找中点共 O(n)，共 log n 层），空间 O(log n)（递归栈）
