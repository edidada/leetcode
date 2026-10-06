# Longest Substring Without Repeating Characters

- **对应程序**: `longest-substring-without-repeating-characters/Solution.java`
- **算法**: 双指针 + 循环不变量（barrier）
- **思路**: 维护不变量：`s[barrier..i]` 内无重复字符。新字符 `str[i]` 到来时，从 `i-1` 向 `barrier` 反向线性查找，若发现相同字符 `str[j]` 就把 `barrier` 前移到 `j+1`；每步用 `i - barrier + 1` 更新最大值。未用哈希表记录上次出现位置，靠内层回扫实现。
- **复杂度**: 时间最坏 O(n^2)（如全相同字符）；空间 O(1)
