# Gas Station

- **对应程序**: `gas-station/Solution.java`
- **算法**: 贪心（一次扫描）
- **思路**: 一次遍历每个加油站，计算净剩余 `left = gas[i] - cost[i]`，同时累计全局 `total` 和从当前候选起点出发的 `from_start`。一旦 `from_start < 0`，说明从当前 `start` 出发必然失败，于是把 `from_start` 清零、候选起点重置为下一个站 `i+1`。遍历结束后 `total >= 0` 时返回 `start`，否则返回 -1。
- **复杂度**: 时间 O(n)，空间 O(1)
