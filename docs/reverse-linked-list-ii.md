# Reverse Linked List II

- **对应程序**: `reverse-linked-list-ii/Solution.java`
- **算法**: 链表局部反转（一次遍历 + 头插式改链）
- **思路**: 单链游标 `head` 配计数器 `c` 逐节点前移（先保存后继 `t`）。到达 `c == m` 时记录左接点 `jointLeft = prev` 和将被反转段的最右原节点 `jointRight = head`；在 `m <= c <= n` 区间内执行 `head.next = prev` 就地反转指针。到 `c == n` 时接回两侧：`jointLeft.next = prev`（反转段新头）、`jointRight.next = head`（后继未动部分）；若反转段从原头开始（`jointRight == _head`）则返回 `prev` 作为新头，否则返回 `_head`。
- **复杂度**: 时间 O(n)，空间 O(1)
