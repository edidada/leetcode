# Two Sum III - Data structure design

- **对应程序**: `two-sum-iii-data-structure-design/Solution.java`
- **算法**: 哈希表（数据结构设计）
- **思路**: `Solution.java` 中实现的即 `TwoSum` 类（内容与同目录 `TwoSum.java` 一致）。用 `Map<Integer,Integer> nums` 存数字到出现次数的映射。`add` 累加计数；`find` 遍历键集合，对每个 `n` 查补数 `value-n`：若补数存在且两者相等则需计数 `>1` 才成功，不相等则直接返回 `true`。
- **复杂度**: add 时间 O(1)；find 时间 O(n)，空间 O(n)
