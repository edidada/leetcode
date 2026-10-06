# Linked List Cycle II

- **对应程序**: `linked-list-cycle-ii/Solution.java`
- **算法**: 快慢指针（Floyd 判圈）
- **思路**: 第一遍快慢指针相遇后不直接返回，而是继续让两指针各走一步直至再次相遇，用 `lenc` 统计出环的长度；第二遍让 `fast` 从表头先走 `lenc` 步，然后 `slow`、`fast` 同步各走一步，两者再次相等的位置即为环的入口。
- **复杂度**: 时间 O(n)；空间 O(1)
