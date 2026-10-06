# 4Sum

- **对应程序**: `4sum/Solution.java`
- **算法**: 哈希表缓存「两数之和」（空间换时间）+ 组合枚举
- **思路**: 先把数组排序，然后双重循环枚举所有下标对 `(i, j)`，把 `num[i]+num[j]` 作为 key、内部类 `TwoSum`（记录 `index1/index2`）作为 value 存入 `HashMap<Integer, ArrayList<TwoSum>> cache`。随后遍历 cache 的每个 key `a`，查找 `b = target - a` 是否也在 cache 中，若存在则对两组 `TwoSum` 做笛卡尔积，用 `sa.overlap(sb)` 判断下标是否复用（四数必须来自四个不同元素），再把四个数排序后用 `Arrays.toString(sol)` 作为 uid 放入 `HashSet<String> block` 去重。命中的 key 会被置为 `null` 以免重复处理。
- **复杂度**: 时间 最坏 O(n^4)（建表 O(n^2)，同和值对数量可达 O(n^2)，笛卡尔积枚举），空间 O(n^2)
