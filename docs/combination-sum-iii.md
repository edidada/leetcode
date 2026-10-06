# Combination Sum III

- **对应程序**: `combination-sum-iii/Solution.java`
- **算法**: 回溯（DFS）+ 剪枝
- **思路**: 在 1~9 中按递增顺序选 k 个数使和为 n。`search(p, k, current, n, st)` 从 st 开始向后枚举（保证严格递增不重复），并用两个界限剪枝：`current + 9 * (k - p) < n`（剩余全选最大也凑不够）与 `current + 1 * (k - p) > n`（剩余全选最小也超了）时直接返回；填满 k 个位置且和相等时记录结果。
- **复杂度**: 时间 O(C(9, k))（组合数级别），空间 O(k)
