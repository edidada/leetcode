# Count Complete Tree Nodes

- **对应程序**: `count-complete-tree-nodes/Solution.java`
- **算法**: 完全二叉树性质 + 递归计数
- **思路**: 先用 `height` 沿左链求出树高 h。`countLeaves` 自上而下走到距叶两层处检查最后一层：若某节点 right 非空则该层成对计数 `leaves += 2`，一旦发现缺子树就置 `stop = true` 停止继续搜索。若走完未触发 stop 说明是满二叉树，直接返回 `2^h - 1`；否则返回 `perfectTreeNodeCount(h - 1) + leaves`（满部分 + 最后一层实际叶数）。
- **复杂度**: 时间最坏 O(n)（最后一层接近满时需逐个检查），空间 O(h)（递归深度）
