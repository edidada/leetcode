# Reverse Nodes in k-Group

- **对应程序**: `reverse-nodes-in-k-group/Solution.java`
- **算法**: 链表分组反转（递归 + 迭代 reverse）
- **思路**: `reverseKGroup` 先让 `tail` 从 `head` 走 `k-1` 步，走不到（不足 k 个）就原样返回。否则保存 `next = tail.next`，把 `tail.next = null` 截断出本组，调用迭代版 `reverse`（prev/头插式三指针）反转本组；原 `head` 变为新尾，其 `next` 接上递归处理 `next` 的后续组。`k <= 1` 或空表直接返回。
- **复杂度**: 时间 O(n)，空间 O(n/k)（递归栈）
