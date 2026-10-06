# Factorial Trailing Zeroes

- **对应程序**: `factorial-trailing-zeroes/Solution.java`
- **算法**: 数学模拟（质因子计数）
- **思路**: 逐个遍历 1..n 的每个数 `i`，用 while 循环剥离其中的因子 5 和 2，分别累计到 `c5`、`c2`；每一轮取 `min(c2, c5)` 作为可配对出的尾零数加入 `count`，并把消耗掉的 2 和 5 计数减去。本质是模拟阶乘中 2×5 配对，而不是常见的 `n/5 + n/25 + ...` 公式。
- **复杂度**: 时间 O(n log n)（每个数需剥离质因子），空间 O(1)
