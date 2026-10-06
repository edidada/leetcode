# Binary Tree Postorder Traversal

- **对应程序**: `binary-tree-postorder-traversal/Solution.java`
- **算法**: 显式栈模拟递归（状态机式非递归后序遍历）
- **思路**: 与 [Binary Tree Inorder Traversal](./binary-tree-inorder-traversal.md) 同一套 `ReturnAddress`（`PRE/IN/POST/DONE`）+ `StackState` 状态机，只是把「访问节点」的时机挪到最后：PRE 分支把返回地址改为 IN，有左子就压回自身并入左子；IN 分支改为 POST，有右子同样压回自身并入右子；只有到 POST 分支（左右子树都处理完）才 `current.returnAddress = DONE; rt.add(current.param.val)` 输出节点值。
- **复杂度**: 时间 O(n)，空间 O(h)（最坏 O(n)）
