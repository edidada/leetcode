# Basic Calculator

- **对应程序**: `basic-calculator/Solution.java`
- **算法**: 调度场算法（中缀转逆波兰 RPN）+ 栈求值
- **思路**: 代码分三部分。`Tokenizer` 用 `Scanner` 按单字符分隔流式取 token，`while(scanner.hasNextInt())` 累积 `buf = buf*10 + nextInt()` 拼出多位数（DIGIT），否则查静态表 `TOKENS[256]` 得到运算符，空白等无效字符通过递归 `next()` 跳过，结束返回 `EOL` 哨兵。`calculate` 维护运算符栈 `op`：DIGIT 直接喂给 `RPNCalculator`；`+ -` 遇到栈顶是任意 `+ - * /` 时 `calculator.addToken(op.pop())` 并 `continue retry` 继续弹栈，`* /` 只在栈顶为 `* /` 时弹出，`(` 直接入栈，`)` 循环弹栈计算直到遇 `(`。`RPNCalculator` 用一个 `LinkedList<Integer> stack` 边收 token 边算，出栈两操作数按符号计算后回push，最后 `val()` 取栈顶。
- **复杂度**: 时间 O(n)（每个 token 常数次入出栈），空间 O(n)
