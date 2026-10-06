# Encode and Decode Strings

- **对应程序**: `encode-and-decode-strings/Solution.java`
- **算法**: 长度前缀编码（定宽十六进制头）
- **思路**: `MAX_LEN` 取 `Integer.MAX_VALUE` 的十六进制字符串长度，`%0<n>x` 格式把每个整数编码成定宽小写十六进制。encode 依次写入：字符串个数、然后每个串的"长度 + 原文"；decode 按固定偏移用 `deserializeNumber` 读出个数与各串长度，再 `new String(S, offset, len)` 切片还原，无需分隔符且可含任意字符。
- **复杂度**: 时间 O(总字符数)，空间 O(总字符数)
