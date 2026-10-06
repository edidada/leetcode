# Reverse Words in a String II

- **对应程序**: `reverse-words-in-a-string-ii/Solution.java`
- **算法**: 双指针原地翻转（整体反转 + 逐词反转）
- **思路**: 经典两段式原地法：`reverse(s, 0, s.length)` 先把整个字符数组逆序，使各单词顺序颠倒但词内字符也反了；再从头扫描，遇到空格就把 `[nextWordStart, i)` 这段（当前单词）`reverse` 回来并推进 `nextWordStart`，循环外补翻最后一个单词 `reverse(s, nextWordStart, s.length)`。`reverse` 由对称 `swap` 实现。全部在数组上就地完成。
- **复杂度**: 时间 O(n)，空间 O(1)
