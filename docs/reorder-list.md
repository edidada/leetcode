# Reorder List

- **对应程序**: `reorder-list/Solution.java`
- **算法**: 快慢指针找中点 + 链表反转 + 交叉合并
- **思路**: 三步走：`mid(head)` 用 fast/slow 指针找中点并在 `mid.next = null` 处把链表切成前后两半；`reverse(right)` 迭代反转后半段；然后从 `head` 起交替插入——每次取左节点 `head`、右节点 `r`，做 `head.next = r; r.next = t(左后继)` 实现 L1→Rn→L2→Rn-1 的重排，右半用完（`r == null`）即返回。全程原地改指针。
- **复杂度**: 时间 O(n)，空间 O(1)
