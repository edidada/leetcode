# String to Integer (atoi)

- **对应程序**: `string-to-integer-atoi/Solution.java`
- **算法**: 字符串线性解析 + 溢出截断
- **思路**: 先跳过前导空格；遇 `+`/`-` 记录 `sign` 并置 `signseen`，若已见符号又再遇非数字（或非法字符）直接返回 0；从第一个数字开始用 `e` 扫到非数字确定数字段 `[s, e)`；随后逐位累加 `sum = sum*10 + (ds[i]-'0')`，一旦 `sum > Integer.MAX_VALUE/10`（或等于且末位大于 7）就置 `flago = true`，最后按符号返回 `Integer.MAX_VALUE` 或 `Integer.MIN_VALUE` 实现饱和截断。
- **复杂度**: 时间 O(n)，空间 O(1)
