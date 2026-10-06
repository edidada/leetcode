# Best Time to Buy and Sell Stock

- **对应程序**: `best-time-to-buy-and-sell-stock/Solution.java`
- **算法**: 一次遍历（前缀最小值 + 贪心）
- **思路**: 只允许一次买卖，要求「最低价不高过最高价」。用 `lowest = Integer.MAX_VALUE` 记录截至当前出现过的最低价格，遍历 `for(int p : prices)` 时先 `lowest = Math.min(lowest, p)`，再用本次卖出的收益更新答案 `max = Math.max(p - lowest, max)`，一次遍历即得最大利润。
- **复杂度**: 时间 O(n)，空间 O(1)
