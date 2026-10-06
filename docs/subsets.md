# Subsets

- **对应程序**: `subsets/Solution.java`
- **算法**: 位掩码枚举子集（Bitmask）
- **思路**: 先对 `S` 排序保证子集内部升序；用 `IntStream.range(0, 1 << S.length)` 枚举掩码 `mask`，对每个掩码再用内层 `IntStream.range(0, S.length)` 过滤满足 `((1 << i) & mask) > 0` 的下标，收集对应元素为一个子列表，最终 `collect(Collectors.toList())` 得到全部子集。
- **复杂度**: 时间 O(n · 2ⁿ)，空间 O(n · 2ⁿ)（输出规模）
