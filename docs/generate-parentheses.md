# Generate Parentheses

- **对应程序**: `generate-parentheses/Solution.java`
- **算法**: 递归构造 + HashSet 去重
- **思路**: 以 `n-1` 的结果为基础，在每个串外面包一层 `(...)`、或在头/尾拼 `()`；再对 `2 <= i < n-1` 的组合把 `generateParenthesis(n-i)` 与 `generateParenthesis(i)` 的结果两两拼接（两种顺序都试）。所有产物放入 `HashSet<String>` 去重后转回 List 返回。非标准的"插空/回溯"做法，靠集合消除重复串。
- **复杂度**: 时间 O(C^n)（指数级，含大量重复生成与去重），空间 O(n! 级别的中间集合)
