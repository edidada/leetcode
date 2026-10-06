# Count Univalue Subtrees

- **对应程序**: `count-univalue-subtrees/Solution.java`
- **算法**: DFS（后序递归）
- **思路**: `_countUnivalSubtrees` 自底向上返回 `Integer[]{计数, 该子树的唯一值或 null}`。`patch` 技巧：当 child 为 null 时把对应数组的唯一值填成父节点值，使空孩子总是与父相等。若左右返回的唯一值都等于 `root.val`，则当前节点也构成单值子树，返回 `{left[0] + right[0] + 1, root.val}`；否则不 +1 且唯一值置 null。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈）
