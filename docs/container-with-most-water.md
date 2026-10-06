# Container With Most Water

- **对应程序**: `container-with-most-water/Solution.java`
- **算法**: 双指针（贪心）
- **思路**: 指针 st、ed 分别指向首尾木板，每轮计算当前容量 `min(height[st], height[ed]) * (ed - st)` 并更新 max，然后把较矮的一侧向内移动一步（`height[st] <= height[ed]` 时 st++，否则 ed--），直到两指针相遇。
- **复杂度**: 时间 O(n)，空间 O(1)
