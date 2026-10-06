# Peeking Iterator

- **对应程序**: `peeking-iterator/Solution.java`
- **算法**: 装饰器模式（单元素预读缓冲）
- **思路**: 包装底层 Iterator，用一个槽位 `next` 缓存预读元素，以哨兵对象 `NONE`（引用相等判断 `next == NONE`）表示缓冲为空。`peek` 时若缓冲为空就从底层 `iterator.next()` 取一个放入缓冲再返回；`next` 优先消费缓冲（finally 清空）否则直接透传底层；`hasNext` 为缓冲非空或底层还有元素。
- **复杂度**: 时间 peek/next/hasNext 均 O(1)，空间 O(1)（一个缓冲槽）
