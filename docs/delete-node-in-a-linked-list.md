# Delete Node in a Linked List

- **对应程序**: `delete-node-in-a-linked-list/Solution.java`
- **算法**: 链表技巧（值覆盖删除）
- **思路**: 拿不到前驱节点时，直接把下一节点的值与 next 指针拷贝到当前节点：`node.val = node.next.val; node.next = node.next.next;`，等价于逻辑上删除了该节点（实际删掉的是后一个节点）。
- **复杂度**: 时间 O(1)，空间 O(1)
