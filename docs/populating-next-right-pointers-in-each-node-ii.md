# Populating Next Right Pointers in Each Node II

- **对应程序**: `populating-next-right-pointers-in-each-node-ii/Solution.java`
- **算法**: DFS + 沿已建 next 链寻找后继（一般二叉树层序链接）
- **思路**: 面向任意二叉树。核心是辅助函数 `sib(me, parent)`：先看父节点的另一侧非空孩子，若没有就带哨兵 `ORPHAN` 沿 `parent.next` 链向右递归寻找下一个有孩子的父节点，从而找到当前节点在下一层的真实后继。`connect` 中给 `root.left`、`root.right` 分别设置 `next`，并先递归右子树再递归左子树，保证同层 next 链在被依赖时已经建好。
- **复杂度**: 时间 O(n)（均摊，沿 next 链查找），空间 O(h)（递归栈）
