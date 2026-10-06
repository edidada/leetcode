# Plus One

- **对应程序**: `plus-one/Solution.java`
- **算法**: 模拟大数加法（逐位进位）
- **思路**: 分配长度为 `digits.length + 1` 的 `result` 数组容纳可能的进位扩张，先对最低位 `+1`，再从右向左逐位执行 `result[i+1] += digits[i]`、`result[i] += result[i+1]/10`、`result[i+1] %= 10` 完成进位传递。最后若首位 `result[0] == 0` 用 `Arrays.copyOfRange` 去掉前导零，否则返回整个数组（如 999 → 1000）。
- **复杂度**: 时间 O(n)，空间 O(n)
