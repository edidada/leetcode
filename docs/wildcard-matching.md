# Wildcard Matching

- **对应程序**: `wildcard-matching/Solution.java`
- **算法**: 贪心 + 断点回溯（双指针）
- **思路**: 用指针 `i` 扫串 `S`、`j` 扫模式 `P`。字符相等或 `P[j]=='?'` 时两指针同步前进；遇 `P[j]=='*'` 时记录断点 `checkpointS=i`、`checkpointP=j` 并只让 `j++`（先假设 `*` 匹配空）。发生不匹配时，若存在断点则回退：让 `*` 多吞一个字符（`checkpointS++`），把 `i` 重置为 `checkpointS`、`j` 重置为 `checkpointP+1` 继续；无断点则返回 `false`。主循环结束后跳过 `P` 尾部剩余的 `*`，若还有非 `*` 字符则失败。
- **复杂度**: 时间 O(m*n)（最坏回溯），空间 O(1)
