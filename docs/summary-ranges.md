# Summary Ranges

- **对应程序**: `summary-ranges/Solution.java`
- **算法**: 一次遍历（顺序扫描）
- **思路**: 定义内部类 `Range` 记录当前连续段的起点 `st` 与终点 `ed`，并用 `toString()` 按 `ed==st` 输出单值或 `st->ed` 格式。遍历 `nums`，若 `nums[i] - r.ed == 1` 则延长当前段终点，否则将当前段结果加入列表并以 `nums[i]` 开新段，循环结束后再补入最后一段。空数组直接返回空列表。
- **复杂度**: 时间 O(n)，空间 O(1)（不计输出）
