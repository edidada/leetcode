# Subsets II

- **对应程序**: `subsets-ii/Solution.java`
- **算法**: 位掩码枚举 + HashSet 去重
- **思路**: 与 `subsets` 相同：先排序，再用 `IntStream.range(0, 1 << num.length)` 枚举止码，按位提取元素组成子列表；差别在于把 `collect(Collectors.toList())` 换成 `collect(Collectors.toSet())` 再包成 `ArrayList`，利用 `List` 的 `equals/hashCode` 自动合并因重复元素产生的相同子集。
- **复杂度**: 时间 O(n · 2ⁿ)，空间 O(n · 2ⁿ)
