# Search for a Range

- **对应程序**: `search-for-a-range/Solution.java`
- **算法**: 二分查找 + 线性向两侧扩展
- **思路**: 用 `[s, e)` 左闭右开区间做标准二分，若 `A[mid] == target` 就以 `mid` 为中心分别向左、向右逐格步进 `_s--` / `_e++` 直到越界或遇到不同值，返回 `[_s, _e]`；`A[mid] < target` 时收缩左边界 `s = mid + 1`，否则 `e = mid`。找不到则返回 `{-1, -1}`。
- **复杂度**: 时间 O(log n + k)（k 为 target 出现次数，最坏 O(n)），空间 O(1)
