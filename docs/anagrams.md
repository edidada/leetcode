# Anagrams

- **对应程序**: `anagrams/Solution.java`
- **算法**: 排序规范化 + 哈希分组
- **思路**: 互为变位词字符串排序后得到同一个串，因此用 Stream 的 `Collectors.groupingBy`，分类函数把每个字符串 `toCharArray()` 后 `Arrays.sort(w)` 再 `new String(w)` 作为 key 分组。随后取 `.values()`，`filter(v -> v.size() > 1)` 只保留成组（至少两个）的变位词，再 `flatMap(v -> v.stream())` 摊平收集为列表。
- **复杂度**: 时间 O(n · k log k)（n 个字符串、最长长度 k），空间 O(n · k)
