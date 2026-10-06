# Different Ways to Add Parentheses

- **对应程序**: `different-ways-to-add-parentheses/Solution.java`
- **算法**: 分治递归（卡特兰式枚举）
- **思路**: 先用逐字符 Scanner 把表达式解析成数字数组 nums 和运算符数组 ops。`diffWaysToCompute(nst, ned)` 枚举最后一个生效的运算符位置 i（即所有加括号方案）：递归求出左半 `[nst, i+1)` 与右半 `[i+1, ned)` 的所有可能值，`merge` 对两侧结果做笛卡尔积并按 `ops[i]` 运算合并；区间只剩一个数时直接返回它。
- **复杂度**: 时间 O(4^n / sqrt(n))（卡特兰数级），空间 O(结果规模)（未做记忆化）
