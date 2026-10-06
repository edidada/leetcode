# Jump Game II

- **对应程序**: `jump-game-ii/Solution.java`
- **算法**: 贪心（逐"层"扩展最远 reach，README 形容其形似 Prim 算法）
- **思路**: 变量 `i` 表示当前跳数能到达的最远位置，`laststep` 记住上一跳的边界。每轮先取 `maxstep = i + A[i]`，再扫一遍上一跳区间 `(laststep, i]` 中各位置能延伸的 `j + A[j]` 取最大，然后把 `i` 直接推进到 `maxstep`、`count++`，直到 `i >= A.length - 1`。相当于每跳一次就吃掉一整层可达区间，求最少跳数（默认题目保证可达）。
- **复杂度**: 时间 O(n)（内层循环把所有位置合计至多扫一遍），空间 O(1)
