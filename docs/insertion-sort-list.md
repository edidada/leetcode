# Insertion Sort List

- **对应程序**: `insertion-sort-list/Solution.java`
- **算法**: 插入排序（链表版）
- **思路**: 建一个值为 `Integer.MIN_VALUE` 的哨兵节点 `_head`，把原链表第一个节点作为初始"已排序表"。每次从未排序部分摘一个节点 `taken`，从 `_head.next` 起沿已排序链扫描，找到第一个大于 `taken.val` 的节点处插入（`last.next = taken; taken.next = cur`），扫到尾则接在最后。
- **复杂度**: 时间 O(n^2)（每个节点线性找插入位），空间 O(1)（仅指针操作）
