# Word Ladder

- **对应程序**: `word-ladder/Solution.java`
- **算法**: BFS（分层）
- **思路**: 用 `LinkedList<String> queue` 作队列，插入特殊哨兵 `END` 分隔层，`level` 计数器每遇 `END` 自增并重新入队。弹出单词时若等于 `end` 则返回 `level+1`。否则对当前单词逐位替换成 `a..z`（跳过原字符）生成新串，命中 `dict` 且未在访问集 `vi` 中则入队并标记访问。队列耗尽仍未到达则返回 0。
- **复杂度**: 时间 O(wordLen^2 * dictSize)，空间 O(dictSize)
