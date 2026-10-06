# LRU Cache

- **对应程序**: `lru-cache/Solution.java`
- **算法**: 手写哈希表（链地址法）+ 双向链表
- **思路**: 未用 JDK 的 `LinkedHashMap`，而是手搓数据结构：`Entry[] data` 哈希桶按 `key % capacity` 定位，冲突走 `hashnext` 拉链；双向链表（`linknext/linkprev`，哨兵 `head/tail`）维护使用顺序，`get`/更新时 `moveToHead`，容量满时 `removeOneFromTail` 淘汰尾部并同时从哈希链中摘除。
- **复杂度**: 时间 O(1) 平均（get/set，哈希定位）；空间 O(capacity)
