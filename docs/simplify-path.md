# Simplify Path

- **对应程序**: `simplify-path/Solution.java`
- **算法**: 字符串分割 + 栈（逆序遍历）
- **思路**: 先 `path.split("/")` 拆成 token，再从尾到头反向遍历：遇 `..` 令 `eat++` 记录要吞掉的目录数，遇 `.` 或空串跳过；正常目录名若 `eat > 0` 则消耗一层，否则 `stack.push(token)`。最后弹出栈中元素拼接，前面加 `/`，多段之间也插 `/`。
- **复杂度**: 时间 O(n)，空间 O(n)
