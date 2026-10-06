# Implement Stack using Queues

- **对应程序**: `implement-stack-using-queues/Solution.java`（实现类 `MyStack`，另有同内容副本 `MyStack.java`）
- **算法**: 数据结构设计（队列 + 代价放在 push）
- **思路**: 用 `Queue<Integer>`（LinkedList 实现）模拟栈。push 时新建队列 `swap`，先放入新元素 x，再把旧队列全部 `remove/add` 转存到其后，然后 `queue = swap`，使队首即栈顶。于是 `pop`、`top`、`empty` 直接对队首操作，O(1) 完成。属于"入栈昂贵、出栈廉价"的实现方式。
- **复杂度**: push 时间 O(n)，pop/top/empty 时间 O(1)；空间 O(n)
