# Maximum Product Subarray

- **对应程序**: `maximum-product-subarray/Solution.java`
- **算法**: 动态规划（双状态滚动）
- **思路**: 不能像最大子段和那样丢弃"坏历史"，因为负数乘以后续负数可能翻身。故以每个位置结尾的乘积维护两个滚动量：`positive_history`（最大积）与 `negative_history`（最小积）。每步先把两者同乘 `A[i]`，若负大于正则交换，再用 `Math.max(A[i], ·)` / `Math.min(A[i], ·)` 允许从当前元素重新起段，全局答案取各步 `positive_history` 的最大值。
- **复杂度**: 时间 O(n)；空间 O(1)
