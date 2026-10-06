# First Bad Version

- **对应程序**: `first-bad-version/Solution.java`
- **算法**: 二分查找
- **思路**: 维护两个边界 `good = 0`（不存在的"最后好版本"）和 `bad = n`，循环取中点 `t = (bad - good) / 2 + good`（写成减法形式以避免加法溢出，代码注释 "fuck overflow"）。`isBadVersion(t)` 为真则收缩 `bad = t`，否则 `good = t`；当 `bad - good <= 1` 时返回 `bad`，即第一个坏版本。
- **复杂度**: 时间 O(log n)，空间 O(1)
