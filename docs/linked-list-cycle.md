# Linked List Cycle

- **对应程序**: `linked-list-cycle/Solution.java`
- **算法**: 快慢指针（Floyd 判圈）
- **思路**: `slow` 每次走一步、`fast` 每次走两步，循环中先检查 `fast`、`fast.next` 是否为空——为空说明链表有终点、无环，直接返回 false；若某次 `fast == slow` 相遇则说明存在环。
- **复杂度**: 时间 O(n)；空间 O(1)
