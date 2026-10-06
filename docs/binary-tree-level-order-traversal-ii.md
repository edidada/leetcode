# Binary Tree Level Order Traversal II

- **对应程序**: `binary-tree-level-order-traversal-ii/Solution.java`
- **算法**: BFS（队列 + 层末哨兵）+ 头插逆序输出
- **思路**: 与 [Binary Tree Level Order Traversal](./binary-tree-level-order-traversal.md) 完全同构，只是要求自底向上输出层。遍历部分相同：`queue` 中用哨兵 `END` 分层，非哨兵节点值加入 `level` 并把左右子入队；差别在结果容器换成 `LinkedList<List<Integer>> rt`，每层结束时用 `rt.push(...)` 头插而非 `add` 尾插，于是先处理的顶层被不断压到后面，天然得到倒序结果。
- **复杂度**: 时间 O(n)，空间 O(n)
