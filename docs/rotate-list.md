# Rotate List

- **对应程序**: `rotate-list/Solution.java`
- **算法**: 链表成环 + 快慢定位断环
- **思路**: 先遍历到尾节点并统计长度 `len`，将 `tail.next = head` 把单链表接成环；对 `k` 取模后，从 `head` 起前进 `len - k - 1` 步到达新尾节点，返回其 `head.next` 作为新头，最后借助 `try/finally` 把新尾的 `next` 置为 `null` 断开环。
- **复杂度**: 时间 O(n)，空间 O(1)
