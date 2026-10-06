# Rotate Array

- **对应程序**: `rotate-array/Solution.java`
- **算法**: 循环置换（Cycle Replacement，利用 GCD 分环）
- **思路**: 从下标 `j` 出发，沿 `i = (i + k) % nums.length` 依次把前驱值写入后继位置，用一个临时变量 `t` 承接被覆盖的旧值，直到回到起点 `j` 完成一环；外层枚举 `j = 0..k-1` 并用计数器 `c` 统计已放置的元素数，当 `c == nums.length` 时提前退出，从而原地完成 k 次右移。
- **复杂度**: 时间 O(n)，空间 O(1)
