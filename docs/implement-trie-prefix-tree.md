# Implement Trie (Prefix Tree)

- **对应程序**: `implement-trie-prefix-tree/Solution.java`（实现类 `Trie` 与 `TrieNode`，另有同内容副本 `Trie.java`）
- **算法**: 字典树（Trie，递归插入/查询）
- **思路**: `TrieNode` 持有 26 长度的子节点数组 `children` 和结束计数 `count`，`index(c)` 用 `c - 'a'` 映射字符。`insert` 沿字符递归建节点（`safe()` 惰性创建），走到词尾把 `count++`；`search` 沿路径递归，节点缺失即 false，走完后要求 `count > 0`；`startsWith` 与 search 类似但走完后直接返回 true（只要求前缀路径存在）。
- **复杂度**: 每次操作时间 O(L)（L 为词长），空间 O(总字符数 × 26 上界)
