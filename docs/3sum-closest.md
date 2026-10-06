# 3Sum Closest

- **对应程序**: `3sum-closest/Solution.java`
- **算法**: 排序 + 双指针夹逼（中间线性扫描）
- **思路**: 结构与 [3Sum](./3sum.md) 相同：`Arrays.sort(num)` 后，`pneg` 与 `ppos` 分别从两端向中间枚举，中间用 `for(int i = pneg+1; i < ppos; i++)` 线性遍历第三个数。区别在于不判断是否等于 target，而是每次用 `Math.abs(target - (num[i] + sum)) < Math.abs(target - closest)` 更新 `closest`（初始为 `num[0]+num[1]+num[2]`）。同样通过 `old` 变量跳过重复值。
- **复杂度**: 时间 O(n^3)（最坏三层循环），空间 O(1)
