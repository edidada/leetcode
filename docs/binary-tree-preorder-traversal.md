# Binary Tree Preorder Traversal

- **对应程序**: `binary-tree-preorder-traversal/Solution.java`
- **算法**: 显式栈模拟递归（状态机式非递归前序遍历）
- **思路**: 同样复用 `ReturnAddress` + `StackState` 的状态机骨架，仅调整三个阶段的顺序：PRE 分支立即 `rt.add(current.param.val)` 访问节点并把返回地址置为 IN；IN 分支置 POST，若有左子则压回自身再压左子 `continue`；POST 分支置 DONE，若有右子同样压回自身再压右子。因此节点在入栈前先被记录，得到根-左-右的前序序列。
- **复杂度**: 时间 O(n)，空间 O(h)（最坏 O(n)）
