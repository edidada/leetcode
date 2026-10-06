# Binary Tree Inorder Traversal

- **对应程序**: `binary-tree-inorder-traversal/Solution.java`
- **算法**: 显式栈模拟递归（状态机式非递归中序遍历）
- **思路**: 不用递归，而是自定义 `ReturnAddress` 枚举 `PRE/IN/POST/DONE` 和 `StackState`（返回地址 + 节点参数），把栈当成「函数调用帧」。主循环弹出 `current` 后按 `switch(current.returnAddress)` 分派：PRE 分支把返回地址改为 IN，若有左子则压回自身再压左子并 `continue`；IN 分支改为 POST 并 `rt.add(current.param.val)` 访问节点；POST 分支改为 DONE，若有右子同样压回自身再压右子。case 之间无 break 的穿透正是模拟递归返回后继续执行后续语句。
- **复杂度**: 时间 O(n)，空间 O(h)（h 为树高，最坏 O(n)）
