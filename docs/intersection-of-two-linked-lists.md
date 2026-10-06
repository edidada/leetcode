# Intersection of Two Linked Lists

- **对应程序**: `intersection-of-two-linked-lists/Solution.java`
- **算法**: 双指针（先测长度对齐再同速前进）
- **思路**: `len()` 分别求两链长度，`trim()` 把较长链的头部多出的 `len - min` 个节点跳过，使两指针到尾部距离相同。随后双指针同速前进：按节点值 `iterA.val != iterB.val` 比较，值不同则清空候选，第一次相等且尚无候选时记录交点 `iterA`（此后不再更新）。结束时若任一指针未走到底说明结构不同，返回 null。注意实现比较的是 val 而非节点引用，且不要求交点后完全一致。
- **复杂度**: 时间 O(m + n)，空间 O(1)
