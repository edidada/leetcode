# 3Sum

- **对应程序**: `3sum/Solution.java`
- **算法**: 排序 + 双指针夹逼（中间线性扫描）
- **思路**: 先 `Arrays.sort(num)`，利用「和为 0 必含负数与正数」的性质，用 `pneg` 从左端扫 `num[pneg] <= 0`、`ppos` 从右端扫 `num[ppos] >= 0`。对每一对 `(pneg, ppos)`，令 `sum = num[pneg] + num[ppos]`，再用 `for(int i = pneg+1; i < ppos; i++)` 线性查找 `num[i] + sum == 0`，命中即加入结果并 `break`。每轮结束后用 `int old = ...; while(...) == old` 跳过重复值来避免重复三元组，`pneg` 在内层结束前被重置为 0。
- **复杂度**: 时间 O(n^3)（排序 O(n log n)，双端指针与中间扫描三层最坏 O(n^3)），空间 O(1)（不计输出列表与排序栈开销）
