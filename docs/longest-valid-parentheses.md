# Longest Valid Parentheses

- **对应程序**: `longest-valid-parentheses/Solution.java`
- **算法**: 栈 + 计数数组
- **思路**: 字符栈保存未匹配的括号，另用 `count[stack.size()]` 记录"以当前栈深度为界已配对的长度"。当栈顶是 `(` 且当前字符是 `)` 时弹栈，并做累加：`count[栈新深度] += 2 + count[栈新深度+1]`（把内层已配对长度并进外层），随后清零内层并更新 `max`；否则直接压栈。
- **复杂度**: 时间 O(n)；空间 O(n)
