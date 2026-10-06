# Meeting Rooms II

- **对应程序**: `meeting-rooms-ii/Solution.java`
- **算法**: 排序 + 贪心分配
- **思路**: 按 `start` 排序后逐个会议调用内部类 `RoomAllocator`：`freeBefore(i.start)` 只记录当前时间，`alloc` 线性查找已有房间列表中第一个 `end <= currentTime` 的空闲房间复用（`set` 替换），找不到就新开一间（`add`）。最终房间列表长度即所需最少会议室数。
- **复杂度**: 时间 O(n log n + n·r)，最坏 O(n^2)（r 为并发房间数）；空间 O(n)
