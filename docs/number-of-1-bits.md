# Number of 1 Bits

- **对应程序**: `number-of-1-bits/Solution.java`
- **算法**: 位运算（并行分治计数 / population count）
- **思路**: 直接复用 JDK `Integer.bitCount` 的 SWAR 位并行算法（注释标明 copy from JDK）：先用 `i - ((i >>> 1) & 0x55555555)` 把每 2 位的计数折叠，再用 `0x33333333` 合并每 4 位、`0x0f0f0f0f` 合并每 8 位，最后经 `>>> 8`、`>>> 16` 累加到最低字节并 `& 0x3f` 取结果。`hammingWeight` 仅转调 `bitCount(n)`，用无符号右移 `>>>` 正确处理负数。
- **复杂度**: 时间 O(1)（固定 5 步位运算），空间 O(1)
