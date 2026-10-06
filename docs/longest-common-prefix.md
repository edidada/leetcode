# Longest Common Prefix

- **对应程序**: `longest-common-prefix/Solution.java`
- **算法**: 纵向逐列比较（暴力扫描）
- **思路**: 以 `strs[0]` 为基准，用偏移 `p` 从 0 开始逐列检查：取 `strs[0].charAt(p)`，遍历所有字符串，若有串长度不超过 `p` 或该位置字符不同则跳出；否则 `p++`。最终返回 `strs[0].substring(0, p)`。空数组与单元素数组有特判。
- **复杂度**: 时间 O(S)，S 为所有字符串前缀匹配扫描的字符总数，最坏 O(n·m)；空间 O(1)（不计返回子串）
