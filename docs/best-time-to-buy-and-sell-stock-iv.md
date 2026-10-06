# Best Time to Buy and Sell Stock IV

- **对应程序**: `best-time-to-buy-and-sell-stock-iv/Solution.java`
- **算法**: 动态规划（持有/未持有双状态 + 差分数组）
- **思路**: 先做 `k = Math.min(k, prices.length)`，当 `k >= prices.length` 时退化为无限交易，直接调用文件内复制的 II 版贪心 `maxProfit(int[])`。否则预处理差分数组 `D[i] = prices[i] - prices[i-1]`，用两个二维表 `H[j][i]`（第 j 笔交易中持有股票的最大收益）和 `P[j][i]`（第 j 笔交易结束、未持仓的最大收益），转移为 `H[j][i] = Math.max(H[j][i-1] + D[i], P[j-1][i-1])`、`P[j][i] = Math.max(H[j][i], P[j][i-1])`。另用 `si` 记录 `P[j-1][i] == P[j][i]` 的最远位置，跳过无效交易轮次，若 `si == prices.length - 1` 提前返回。README 自述这是易于理解但会 TLE 的 O(n^3) 版本。
- **复杂度**: 时间 O(k·n)（README 标注为 TLE 的 O(n^3) 写法），空间 O(k·n)
