# Valid Palindrome

- **对应程序**: `valid-palindrome/Solution.java`
- **算法**: 双指针
- **思路**: 先 `toLowerCase().toCharArray()` 得到字符数组。指针 `i` 从头、`j` 从尾相向移动，`valid` 辅助判断非 `[A-Za-z0-9]` 的字符并跳过；两端有效字符不相等即返回 `false`，相等则 `i++`、`j--` 继续。空串视为回文，`null` 返回 `false`。
- **复杂度**: 时间 O(n)，空间 O(n)
