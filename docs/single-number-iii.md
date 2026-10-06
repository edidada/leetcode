# Single Number III

- **对应程序**: `single-number-iii/Solution.java`
- **算法**: 位运算分组异或
- **思路**: 先把全部数字异或得到 `aXORb`（两个只出现一次数字的异或值）；取 `Integer.lowestOneBit(aXORb)` 得到两者至少一位不同的比特位 `bit`，用它把原数组分成含该位与不含该位两组，只对含 `bit` 的那组异或即可还原出其中一个 `a`；另一个由 `aXORb ^ a` 得出，返回 `{a, b}`。
- **复杂度**: 时间 O(n)，空间 O(1)
