# Contains Duplicate II

- **对应程序**: `contains-duplicate-ii/Solution.java`
- **算法**: 哈希表（值 -> 下标列表）
- **思路**: 用 `Map<Integer, List<Integer>>` 记录每个数值出现过的所有下标。遍历到 i 时，若该值之前出现过，则遍历其历史下标列表，只要存在 `i - j <= k` 即返回 true；随后把 i 追加进列表。k <= 0 时直接返回 false。
- **复杂度**: 时间 O(n·d) 最坏（d 为同一值重复次数，最坏 O(n^2)），空间 O(n)
