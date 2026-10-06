# Contains Duplicate

- **对应程序**: `contains-duplicate/Solution.java`
- **算法**: 哈希集合去重
- **思路**: 遍历数组，每个元素先用 `HashSet.contains` 检查是否已出现，出现则立即返回 true，否则加入集合；遍历结束仍未命中则返回 false。
- **复杂度**: 时间 O(n)，空间 O(n)
