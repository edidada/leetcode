# Implement strStr()

- **对应程序**: `implement-strstr/Solution.java`
- **算法**: KMP 风格单模式匹配（自建部分匹配表做跳跃）
- **思路**: 先对 needle 构造一个简化版部分匹配表 `P`（仅在前一字符与前缀字符相等时令 `P[j] = P[j-1]+1`，否则为 0）。主扫描在 `haystack[i+j] != needle[j]` 失配时，按 `i += max(1, j - P[j])` 把文本指针向前跳，避免逐格回退；完整匹配则返回从 i 起的后缀字符串，越界则返回 null。空 needle 返回 haystack 本身。
- **复杂度**: 时间最坏 O(m·n)（跳跃表不如标准 KMP 严格，不保证线性），空间 O(m)（模式表 P）
