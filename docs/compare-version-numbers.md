# Compare Version Numbers

- **对应程序**: `compare-version-numbers/Solution.java`
- **算法**: 字符串处理（分段补齐 + 逐位比较）
- **思路**: 用 `split("\\.")` 把两个版本号拆成修订号段，`Arrays.copyOf` 把两段数组都补齐到相同长度 m（缺失段为 null，视为空串）。对每一对段，用 `padding` 在左侧补 '0' 到相同长度，然后逐字符比较大小返回 1/-1；所有段相等则返回 0。定长补零后字典序等价于数值序。
- **复杂度**: 时间 O(版本号总长度)，空间 O(总长度)
