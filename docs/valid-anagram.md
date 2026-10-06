# Valid Anagram

- **对应程序**: `valid-anagram/Solution.java`
- **算法**: 排序
- **思路**: 将两串转成字符数组 `S`、`T`，分别用 `Arrays.sort` 排序，再用 `Arrays.equals` 比较是否逐位相同；相同即为变位词。属于排序法而非计数法。
- **复杂度**: 时间 O(n log n)，空间 O(n)
