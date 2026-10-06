# Sliding Window Maximum

- **对应程序**: `sliding-window-maximum/Solution.java`
- **算法**: 单调递减双端队列（Monotonic Deque）
- **思路**: 内部类 `SlidingMaxQueue` 维护 `LinkedList<Integer> queue` 存下标，`add(i)` 时先把队首所有 `<= i - k` 的过期下标弹出，再把队尾所有对应值小于 `nums[i]` 的下标弹出，最后压入 `i`——保持队首永远是当前窗口最大值；主循环依次 `T[max(i-k, 0)] = Q.max()` 后再 `Q.add(i)` 滑动窗口。
- **复杂度**: 时间 O(n)，空间 O(k)
