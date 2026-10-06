# Best Time to Buy and Sell Stock III

- **对应程序**: `best-time-to-buy-and-sell-stock-iii/Solution.java`
- **算法**: 动态规划（左右两次扫描 + 枚举分割点）
- **思路**: 把「最多两笔交易」拆成以某一天为界的两段各一笔。从左往右 `for(i = 1..n-1)` 维护 `left_min = Math.min(left_min, prices[i])`，`left[i] = Math.max(prices[i] - left_min, left[i-1])` 即前缀内一次交易的最大利润；再从右往左维护 `right_max`，`right[i] = Math.max(right_max - prices[i], right[i+1])` 即后缀内一次交易的最大利润。最后 `for(i)` 取 `Math.max(m, left[i] + right[i])` 作为答案。长度 `< 2` 时返回 0。
- **复杂度**: 时间 O(n)，空间 O(n)（left/right 两个数组）
