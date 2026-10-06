# Minimum Size Subarray Sum

- **对应程序**: `minimum-size-subarray-sum/Solution.java`
- **算法**: 滑动窗口（双指针）
- **思路**: 用 `sum` 累计窗口内元素和，左端点 `st` 随窗口收缩。枚举右端 i 并加上 nums[i]，一旦 `sum >= s`，就用 `while(sum - nums[st] >= s) sum -= nums[st++]` 尽量右移左端点收缩窗口，再用 `c = Math.min(c, i - st + 1)` 更新最短长度；若 `c` 始终大于数组长度则返回 0。
- **复杂度**: 时间 O(n)，空间 O(1)
