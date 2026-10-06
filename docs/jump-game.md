# Jump Game

- **对应程序**: `jump-game/Solution.java`
- **算法**: 贪心（维护最大可达位置）
- **思路**: 线性扫描，`maxjump` 记录当前能到达的最远下标。对每个可达位置 `i <= maxjump`，若 `i + A[i]` 已不小于终点则直接返回 true，否则用它更新 `maxjump`；一旦遇到 `i > maxjump` 说明中间断开，返回 false。空数组返回 false。
- **复杂度**: 时间 O(n)，空间 O(1)
