# Min Stack

- **对应程序**: `min-stack/Solution.java`
- **算法**: 辅助栈（双栈设计）
- **思路**: 内部实现了一个基于双向链表节点（Node 含 prev/next）的 `Stack` 类。主栈 `data` 存所有元素，辅助栈 `mins` 只在 `x <= getMin()` 时同步压入当前最小值；`pop` 时若弹出的栈顶 `last <= getMin()` 则同时弹出 `mins`，`getMin` 即取 `mins.top()`，各操作均为 O(1)。
- **复杂度**: 时间 push/pop/top/getMin 均 O(1)，空间 O(n)（mins 最坏与 data 等长）
