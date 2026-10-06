# Palindrome Linked List

- **对应程序**: `palindrome-linked-list/Solution.java`
- **算法**: 快慢指针 + 链表反转
- **思路**: `mid` 用 fast/slow 双指针（fast 每次走两步）找到链表中点；`reverse` 原地反转从中点开始的后半段；然后从反转后的尾部 `m` 与头部 `head` 同步前进逐一比较 `val`，循环条件 `m != head && m != null` 让两者在会合处自然终止，全程无额外数组、O(1) 空间。
- **复杂度**: 时间 O(n)，空间 O(1)
