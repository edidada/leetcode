# Reverse Bits

- **对应程序**: `reverse-bits/Solution.java`
- **算法**: 位运算（分治交换，直接移植 JDK `Integer.reverse`）
- **思路**: `reverseBits` 直接调用复制自 JDK 的 `reverse(int i)`：先用掩码 `0x55555555` 交换相邻 1 位，再用 `0x33333333` 交换相邻 2 位、`0x0f0f0f0f` 交换 4 位，最后一次移位拼合（`i << 24`、`0xff00` 段交换等）交换字节，得到 32 位整体反转。全部在 int 位模式上操作，把输入当作无符号位序列。
- **复杂度**: 时间 O(1)（常数次位操作），空间 O(1)
