# Basic Calculator II

- **对应程序**: `basic-calculator-ii/Solution.java`
- **算法**: 调度场算法（中缀转逆波兰 RPN）+ 栈求值
- **思路**: 与 [Basic Calculator](./basic-calculator.md) 是同一份实现（`Tokenizer` + `TOKENS[256]` 表 + 运算符栈 `op` + `RPNCalculator` 整数栈），只是对应题目不含括号、只有 `+ - * /` 和多位数。多位数由 `while(scanner.hasNextInt()) buf = buf * 10 + scanner.nextInt()` 拼装；优先级靠弹栈规则实现：`+ -` 会先弹出栈顶所有 `+ - * /`，`* /` 只弹出栈顶的 `* /`，`(` `)` 分支也保留在代码中；主循环结束后 `while(!op.isEmpty())` 清空运算符栈，结果取 `calculator.val()`。
- **复杂度**: 时间 O(n)，空间 O(n)
