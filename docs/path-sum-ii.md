# Path Sum II

- **对应程序**: `path-sum-ii/Solution.java`
- **算法**: DFS（递归携带父路径，回溯收集所有解）
- **思路**: 重载的私有 `pathSum(root, sum, parents)` 在每个节点把当前值追加到父路径的拷贝 `p = new ArrayList<>(parents)` 上并继续作差递归；到叶子且 `root.val == sum` 时把完整路径 p 加入结果，否则返回空列表。父节点通过 `addIfNotEmpty` 收集左右子树返回的非空方案集合并向上返回，初始调用传空列表。
- **复杂度**: 时间 O(n·h)（每个节点拷贝路径列表），空间 O(h)（递归栈，不计输出）
