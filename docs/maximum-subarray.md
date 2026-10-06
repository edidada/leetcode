# Maximum Subarray

- **对应程序**: `maximum-subarray/Solution.java`
- **算法**: 动态规划（Kadane 算法）
- **思路**: 滚动维护以当前元素结尾的最大和 `history`："昨天的糟糕历史若为负就忘掉"——`history < 0` 时直接从 `A[i]` 重新起段，否则 `history += A[i]`；每步用 `history` 更新全局 `max`。
- **复杂度**: 时间 O(n)；空间 O(1)
