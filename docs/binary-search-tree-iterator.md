# Binary Search Tree Iterator

- **对应程序**: `binary-search-tree-iterator/Solution.java`
- **算法**: 显式栈模拟递归的中序遍历（协程式返回地址状态机）
- **思路**: 与 [Binary Tree Inorder Traversal](./binary-tree-inorder-traversal.md) 同源：内部类 `StackState` 携带 `ReturnAddress`（`PRE/IN/POST/DONE`）和 `TreeNode param`，用 `Deque<StackState> stack` 保存「调用帧」，靠 switch 的 case 穿透（PRE 落到 IN、IN 落到 POST）模拟函数返回地址。差别在于把遍历切片成可暂停的生成器：`next()` 弹出栈顶，PRE 时改写为 IN 并把左子节点压栈后递归 `next()`；IN 时改写为 POST、压回自身并 `return current.param.val`（即下一个最小值）；POST 时压入右子树继续。`hasNext()` 用同样的状态分派探测栈是否还有内容：栈非空且栈顶为 PRE/IN 时压回并返回 true，为 POST 且存在右子时压入右子返回 true，否则递归 `hasNext()` 继续丢弃 DONE 帧。构造函数只把 root 压栈，因此是懒展开的。
- **复杂度**: 时间 单次 `next()`/`hasNext()` 最坏 O(h)，n 次调用均摊 O(1)（每个节点常数次入出栈），总体 O(n)；空间 O(h)（h 为树高，最坏 O(n)）
