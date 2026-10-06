# Excel Sheet Column Title

- **对应程序**: `excel-sheet-column-title/Solution.java`
- **算法**: 递归（26 进制转换，处理无零表示）
- **思路**: 列号是没有 0 的 26 进制（A=1..Z=26），递归分解：`n < 27` 时直接转成单个字母 `(char)('A' + n - 1)`；若 `n % 26 == 0`，末位必须是 Z，高位转化为 `convertToTitle(n / 26 - 1)` 再拼 'Z'；否则拆成 `convertToTitle(n / 26)` 与 `convertToTitle(n % 26)` 拼接。
- **复杂度**: 时间 O(log26 n)，空间 O(log26 n)（递归栈与结果串）
