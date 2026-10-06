# Swap Nodes in Pairs

- **对应程序**: `swap-nodes-in-pairs/Solution.java`
- **算法**: 递归
- **思路**: 以链表头 `head` 为基准递归。空链表返回 `null`；仅一个节点（`head.next==null`）时原样返回。否则取 `newhead = head.next` 作为新头，将 `head.next` 指向 `swapPairs(head.next.next)`（对剩余部分递归两两交换的结果），再令 `newhead.next = head` 完成本对交换，返回 `newhead`。
- **复杂度**: 时间 O(n)，空间 O(n)（递归栈）
