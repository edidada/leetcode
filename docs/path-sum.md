# Path Sum

- **对应程序**: `path-sum/Solution.java`
- **算法**: DFS（递归，路径和逐层作差）
- **思路**: 递归向下传递剩余和：空节点返回 false；叶子节点直接判断 `root.val == sum`；否则只要左或右子树中存在满足 `hasPathSum(child, sum - root.val)` 的路径即返回 true。不维护路径本身，只做存在性判断。
- **复杂度**: 时间 O(n)，空间 O(h)（h 为树高，递归栈）
