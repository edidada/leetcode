# Valid Parentheses

- **对应程序**: `valid-parentheses/Solution.java`
- **算法**: 栈
- **思路**: 用 `LinkedList<Character>` 作栈。先对空串或奇数长度快速返回 `false`。逐个字符处理：`couple(peek, c)` 判断栈顶与当前字符是否构成 `()[]{}` 配对，配对则 `pop()` 消除，否则 `push(c)` 入栈等待后续配对。最终栈为空即全部中和，返回 `stack.size()==0`。
- **复杂度**: 时间 O(n)，空间 O(n)
