# Repeated DNA Sequences

- **对应程序**: `repeated-dna-sequences/Solution.java`
- **算法**: 基数编码 + 计数数组（哈希/直接寻址）
- **思路**: 把 A/C/G/T 映射为 0..3（`INT_TO_CHAR` 表），`toInt` 将一个 10 长度窗口按 4 进制（预计算 `POW[i] = 4^i`）编码成整数，取值范围 0..4^10-1。用该整数作下标在计数数组 `m` 中对所有窗口累加，最后扫描 `m`，把计数 ≥2 的编码用 `formInt`（逐位模 4 还原字符）解码回字符串收集。以 4^10 大小的 int 数组替代 HashSet 去重计数。
- **复杂度**: 时间 O(n·10 + 4^10)，空间 O(4^10)
