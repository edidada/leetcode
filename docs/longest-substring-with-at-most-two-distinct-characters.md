# Longest Substring with At Most Two Distinct Characters

- **对应程序**: `longest-substring-with-at-most-two-distinct-characters/Solution.java`
- **算法**: 滑动窗口（双指针 + 计数表）
- **思路**: 内部 `Context` 维护窗口 `[start, end]` 与字符计数 `counts`。右端逐字符 `add` 并移动 `end`；一旦 `counts.size() > 2`，就从 `start` 逐字符 `remove`（计数归零即从 map 删除）并右移 `start`，直到窗口内只剩两种字符，每步用 `end - start + 1` 更新最大值。
- **复杂度**: 时间 O(n)，每个字符进出窗口各一次；空间 O(1)（计数表至多 3 个键）
