# Meeting Rooms

- **对应程序**: `meeting-rooms/Solution.java`
- **算法**: 排序 + 线性扫描
- **思路**: 按 `start` 升序排序会议区间，顺序扫描并维护 `maxend`（目前最晚的结束时间）；若某会议的 `start < maxend` 说明与之前某个会议重叠，返回 false，否则用 `Math.max(maxend, i.end)` 推进。全程无重叠即可参加所有会议。
- **复杂度**: 时间 O(n log n)；空间 O(log n)（排序栈开销）
