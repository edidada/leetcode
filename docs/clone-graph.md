# Clone Graph

- **对应程序**: `clone-graph/Solution.java`
- **算法**: BFS 广度优先遍历（两趟：先克隆顶点，再连接边）
- **思路**: 节点为空返回 null。第一趟 BFS 用 `HashMap<UndirectedGraphNode, UndirectedGraphNode> clone` 作「原节点 -> 克隆节点」映射兼作 visited：`queue.poll()` 后若 `!clone.containsKey(n)` 就 `clone.put(n, new UndirectedGraphNode(n.label))` 并把所有 `neighbors` 入队，此趟只复制顶点不建边。第二趟把 `node` 重新入队，配合 `HashSet<UndirectedGraphNode> visit` 去重，对每个原节点取出克隆体 `c = clone.get(n)`，按原图的邻接关系 `c.neighbors.add(clone.get(neighbor))` 连边并把邻居入队。最终返回 `clone.get(node)`。
- **复杂度**: 时间 O(V + E)，空间 O(V)（映射、visited 与队列）
