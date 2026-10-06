# Word Ladder II

- **对应程序**: `word-ladder-ii/Solution.java`
- **算法**: BFS + 路径回溯（Trace 链表）
- **思路**: 先把字典中每个词及 `end` 建成 `Word` 对象放入 `wmap`，`connect` 惰性计算某词逐位替换后在字典中的邻居。用 `Trace`（`obj` + `prev` 指针）构成路径链表，队列以哨兵 `SEP` 分层。逐层扩展时 `vi` 记录已彻底访问的词（层尾由 `svi` 归并），避免更深层重复访问；一旦当前 `Trace` 的词是 `end`，沿 `prev` 链 `addFirst` 还原整条路径加入结果并置 `found=true`，此后不再向更深扩展，遇 `SEP` 时若已 `found` 即 break。从而只收集最短变换序列。
- **复杂度**: 时间 O(wordLen^2 * dictSize + 路径数),空间 O(dictSize + 结果)
