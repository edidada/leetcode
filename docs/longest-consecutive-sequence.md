# Longest Consecutive Sequence

- **对应程序**: `longest-consecutive-sequence/Solution.java`
- **算法**: 哈希集合 + 双向扩散
- **思路**: 先把所有数放入 `HashSet`。对每个数 `n`，从集合中移除它，然后分别向 `n+1, n+2...` 和 `n-1, n-2...` 两个方向扩散：只要下一个数还在集合中就计数并 `remove`。被删过的数不会再被其他起点重复展开，因此每个数至多被访问常数次。
- **复杂度**: 时间 O(n)（平均，删除操作保证摊还线性）；空间 O(n)
