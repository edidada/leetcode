# Sum Root to Leaf Numbers

- **对应程序**: `sum-root-to-leaf-numbers/Solution.java`
- **算法**: 二叉树递归 DFS（携带前缀值）
- **思路**: 私有重载 `sumNumbers(root, parentval)` 中，若 `root == null` 返回 0；否则把父路径十进制左移一位加当前节点值 `p = parentval * 10 + root.val`；当 `root` 是叶节点（左右子均为空）时直接把 `p` 作为该路径数字返回，非叶节点则返回 `sumNumbers(left, p) + sumNumbers(right, p)` 累加左右子树的路径和。公共入口 `sumNumbers(root)` 以 `parentval = 0` 起根。
- **复杂度**: 时间 O(n)，空间 O(h)（递归栈，h 为树高）
