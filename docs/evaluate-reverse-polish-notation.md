# Evaluate Reverse Polish Notation

- **对应程序**: `evaluate-reverse-polish-notation/Solution.java`
- **算法**: 栈模拟
- **思路**: 用 `Deque<Integer>` 遍历 tokens：非运算符直接 `Integer.valueOf` 入栈；遇到 +、-、*、/ 时依次弹出 `v2`、`v1`（注意弹出顺序保证 v1 在前），按对应运算压回。全部处理完后栈顶即表达式的值。
- **复杂度**: 时间 O(n)，空间 O(n)
