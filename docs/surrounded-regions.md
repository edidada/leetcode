# Surrounded Regions

- **对应程序**: `surrounded-regions/Solution.java`
- **算法**: BFS（边界洪水填充）
- **思路**: 用 `HashSet<String> boarderConnected` 记录所有与边界连通的 `O`（以 `x+","+y` 字符串作 id）。对棋盘四条边上的每个格子调用 `connectBoarder`，该方法用 `LinkedList<Point>` 队列做 BFS，向四邻扩展，`connectIfNotConnected` 负责越界、遇到 `X` 或已访问的判定并打标。最后再扫描全盘，把未出现在 `boarderConnected` 中的 `O` 改为 `X`。
- **复杂度**: 时间 O(m*n)，空间 O(m*n)
