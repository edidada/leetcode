# Missing Number

- **对应程序**: `missing-number/Solution.java`
- **算法**: 原地置换排序（值-下标归位）
- **思路**: 通过 `sort` 方法把每个值 `nums[i]` 用 swap 置换到下标 `nums[i]` 处（while 循环直到 `nums[i] == i`）；超出 [0, n) 范围的值被标记为 -1 丢弃。归位完成后线性扫描，第一个满足 `nums[i] != i` 的下标 i 即缺失的数；若全部对齐则缺失的是 `nums.length`。
- **复杂度**: 时间 O(n)（每个元素至多被置换常数次），空间 O(1)
