# Two Sum

- **对应程序**: `two-sum/Solution.java`
- **算法**: 哈希表
- **思路**: 第一遍遍历把每个元素的补数 `target - numbers[i]` 连同下标 `i` 存入 `HashMap`。第二遍遍历对每个 `numbers[i]` 查表 `m.get(numbers[i])`，若命中且命中的下标不等于当前 `i`（避免同一元素自配），返回 1 基下标数组 `{i+1, v+1}`；未找到则抛异常。
- **复杂度**: 时间 O(n)，空间 O(n)
