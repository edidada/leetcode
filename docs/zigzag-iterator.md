# Zigzag Iterator

- **对应程序**: `zigzag-iterator/Solution.java`
- **算法**: 轮询双指针（迭代器交替）
- **思路**: `Solution.java` 中实现的即 `ZigzagIterator` 类（内容与同目录 `ZigzagIterator.java` 一致）。构造时把两个列表的 `Iterator` 存入数组 `ivs`。`next()` 用游标 `p++ % ivs.length` 轮转选择迭代器，跳过已耗尽者，返回第一个 `hasNext()` 为真的元素的下一值；`hasNext()` 只要任一底层迭代器仍有元素即返回 `true`。从而实现两序列的锯齿形交替输出。
- **复杂度**: next/hasNext 摊还 O(1)（此处仅两路），空间 O(1)
