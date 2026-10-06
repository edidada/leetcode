# Add and Search Word - Data structure design

- **对应程序**: `add-and-search-word-data-structure-design/Solution.java`
- **算法**: 前缀树 Trie + DFS 回溯
- **思路**: 内部类 `TrieNode` 持有 `TrieNode[] children = new TrieNode[26]` 与计数 `count`，`insert` 递归按 `index(c) = c - 'a'` 走或 `safe(i)` 懒建子节点，长度耗尽时 `count++` 标记单词结尾。`search` 递归逐字符匹配：遇到通配符 `.` 时遍历所有非空 `children` 依次尝试（回溯式分支），否则直接取对应子节点，为空即返回 false，长度耗尽时以 `count > 0` 判定是否是一个完整单词。`addWord` / `search` 只是从 `root` 入口调用这两个递归方法。
- **复杂度**: 时间 addWord O(L)；search 无 `.` 时 O(L)，含 `.` 时最坏 O(26^L)；空间 O(26 × 已插入字符总数)
