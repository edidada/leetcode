# Majority Element

- **对应程序**: `majority-element/Solution.java`
- **算法**: Boyer-Moore 多数投票
- **思路**: 维护候选 `m` 和计数 `c`：遇相同元素 `c++`；不同且 `c > 1` 时 `c--`（抵消一票）；`c == 1` 且不同则直接换候选 `m = num[i]`（计数保持 1）。由于题目保证多数元素超过 n/2，最终候选即为答案，无需二次验证。
- **复杂度**: 时间 O(n)；空间 O(1)
