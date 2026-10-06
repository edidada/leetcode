# Remove Nth Node From End of List

- **对应程序**: `remove-nth-node-from-end-of-list/Solution.java`
- **算法**: 双指针（快慢指针保持固定间距）
- **思路**: 建哨兵节点 `_head`（val 0）指向 `head`，`fast`、`slow` 同从 `_head` 出发；先让 `fast` 前进 `n` 步，然后两者同步前进直到 `fast.next == null`，此时 `slow` 正好停在待删节点的前驱，执行 `slow.next = slow.next.next` 完成一次遍历删除。哨兵处理了删除头节点（n 等于链表长度）的边界。
- **复杂度**: 时间 O(n)，空间 O(1)
