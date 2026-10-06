# Remove Duplicates from Sorted List

- **对应程序**: `remove-duplicates-from-sorted-list/Solution.java`
- **算法**: 链表遍历（保留首个重复值，跳过后继重复）
- **思路**: 用 `lasthead` 指向最近保留的节点，`node` 向前扫描：内层 `while(node != null && node.val == lasthead.val)` 把所有与保留值相同的后继直接跳过，然后 `lasthead.next = node` 断链，`lasthead` 移到 `node` 继续。利用有序性使同值节点相邻，一遍遍历完成去重，返回原 `head`。
- **复杂度**: 时间 O(n)，空间 O(1)
