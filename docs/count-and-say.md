# Count and Say

- **对应程序**: `count-and-say/Solution.java`
- **算法**: 迭代 + 字符串游程编码
- **思路**: 从初始串 "1" 出发，迭代 n-1 次调用 `countAndSay(prev)`：用 p 扫描字符数组，`last` 与 `count` 跟踪当前连续相同字符段，遇到不同字符就把 "count+last" 拼进结果串并重置计数，末尾再补最后一段。
- **复杂度**: 时间 O(n * L)（L 为最终串长，串长随 n 增长），空间 O(L)
