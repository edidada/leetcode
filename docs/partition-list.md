# Partition List

- **对应程序**: `partition-list/Solution.java`
- **算法**: 链表双子链拼接（哑节点分区）
- **思路**: 建两条带哑节点的子链 `less` 与 `greater`；遍历原链表，逐个摘下节点 `t`（先保存 `head = head.next`），值小于 x 的接到 `_less` 尾，否则接到 `_greater` 尾。遍历完成后置 `_greater.next = null` 终止大值链，再 `_less.next = greater.next` 把两段拼接，返回 `less.next`，保持原有相对顺序。
- **复杂度**: 时间 O(n)，空间 O(1)
