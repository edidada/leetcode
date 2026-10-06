# Scramble String

- **对应程序**: `scramble-string/Solution.java`
- **算法**: 分治递归 + 基于字符计数的队列剪枝
- **思路**: 先用 `checkSameChar`（排序后 `Arrays.equals`）判断 `s1`、`s2` 字符多重集是否相同以快速否定；然后把 `s1` 每个切点 `i` 生成的两种划分（左右/右左）封装为 `Board`（含 `leftString`、`rightString` 与左右字符计数表）压入 `LinkedList` 队列，用哨兵 `SEP` 分层。逐字符扫描 `s2`，只保留 `hasChar(i, c, cnt+1)` 为真的 Board，即第 `i` 位仍能容纳当前累计字符数的候选划分，从而剪掉不可能分支。最终对残余 Board 递归调用 `isScramble` 检查左右子串是否互为变形串，任一成立即返回 `true`。
- **复杂度**: 时间 O(2^n)（递归分治最坏），空间 O(n²)（Board 队列与递归栈）
