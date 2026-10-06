# Isomorphic Strings

- **对应程序**: `isomorphic-strings/Solution.java`
- **算法**: 哈希映射（定长数组存字符映射，双向验证）
- **思路**: 辅助函数 `isIsomorphic(S, T)` 用长度 256 的 `char[] MAP` 记录 S 到 T 的单射：字符未映射（槽位为 0）时写入 `MAP[S[i]] = T[i]`，已映射但不等于当前 T[i] 则返回 false。主函数先比较长度，再要求 `S→T` 与 `T→S` 两个方向都成立，从而保证是一一映射。
- **复杂度**: 时间 O(n)，空间 O(1)（映射表大小固定 256）
