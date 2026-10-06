# Best Time to Buy and Sell Stock II

- **对应程序**: `best-time-to-buy-and-sell-stock-ii/Solution.java`
- **算法**: 贪心（累加所有正向差价）
- **思路**: 允许多次交易，所以「有利润就卖」。长度 `<= 1` 直接返回 0；用 `hold = prices[0]` 表示当前持仓成本，从 `i = 1` 起遍历，若 `hold < prices[i]` 就 `profit += prices[i] - hold`（立刻卖出获利），随后无论是否卖出都执行 `hold = prices[i]`（以当前价重新买入/持有）。等价于把相邻上涨段全部累加。
- **复杂度**: 时间 O(n)，空间 O(1)
