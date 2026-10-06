# Letter Combinations of a Phone Number

- **对应程序**: `letter-combinations-of-a-phone-number/Solution.java`
- **算法**: 回溯（DFS）
- **思路**: 用静态表 `CHAR_MAP` 存数字到字母的映射，`find(digits, p)` 递归处理第 p 位：依次把该数字对应的每个字母写入共享数组 `stack[p]` 再递归下一位；当 `p == digits.length` 时把 `stack` 转成字符串加入结果集，逐层回溯覆盖前一个选择。
- **复杂度**: 时间 O(n · 4^n)；空间 O(n)（递归栈与 `stack` 数组，不计输出）
