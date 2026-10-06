# Word Search II

- **对应程序**: `word-search-ii/Solution.java`
- **算法**: Trie（前缀树）+ DFS 回溯
- **思路**: 先用所有 `words` 构建 `TrieNode` 前缀树（`insert` 逐字符建链，词尾 `count++`；节点记录 `parent/depth/character` 以便 `recover()` 回溯拼出单词）。主流程遍历棋盘每个格子，若根节点有以该字符为边的子树，则调 `findWords` 从该格出发 DFS：用扁平化布尔数组 `vi`（`flatten` 定位）标记路径防重走，进入后若 `current.count>0` 说明匹配到某词，将 `recover()` 结果加入 `found`；再向四邻扩展，仅当邻居字符存在对应 Trie 子节点时递归，返回时撤销 `vi`。最终返回去重的 `found` 集合。
- **复杂度**: 时间 O(m*n*4^L)（受 Trie 前缀剪枝），空间 O(所有词总字符数)
