# Maximum Gap

- **对应程序**: `maximum-gap/Solution.java`
- **算法**: 桶排序思想（抽屉原理）
- **思路**: 先求全局 `min/max`，按 `gap = ceil((max-min)/(n-1))` 把值域划分成约 n 个桶，每桶只记 `min` 与 `max`。由抽屉原理，答案必出现在相邻非空桶之间（桶内间距不超过 gap），因此只需顺序扫描非空桶，用 `buckets[i].min - prev`（prev 为前一非空桶的 max）更新最大间隔。
- **复杂度**: 时间 O(n)；空间 O(n)
