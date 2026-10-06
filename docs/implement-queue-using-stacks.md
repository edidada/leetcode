# Implement Queue using Stacks

- **对应程序**: `implement-queue-using-stacks/Solution.java`
- **算法**: 数据结构设计（单栈 + 代价放在 push）
- **思路**: 只持有一个 `Stack<Integer>`。push 时借用临时栈 `rev`：把原栈全部弹出倒过去，压入新元素 x（此时 x 在栈底），再整体倒回，使栈顶始终是队首。因此 `pop`、`peek`、`empty` 都直接对栈顶操作，O(1) 完成。属于"入队昂贵、出队廉价"的实现方式。
- **复杂度**: push 时间 O(n)，pop/peek/empty 时间 O(1)；空间 O(n)
