# Single Number II

- **对应程序**: `single-number-ii/Solution.java`
- **算法**: 逐位计数（模 3 消去）
- **思路**: 用长度为 `Integer.SIZE` 的 `count[]` 记录每个二进制位在所有数字中出现 1 的次数，同时用 `bit[]` 保存该位是否为 1（`bit[b] |= a >>> b & 1`）；扫描完后，把 `count[b] % 3 != 0` 的那些位用 `s |= bit[b] << b` 拼起来，即为只出现一次的那个整数。
- **复杂度**: 时间 O(n·32)，空间 O(32) = O(1)
