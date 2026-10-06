# Add Two Numbers

- **对应程序**: `add-two-numbers/Solution.java`
- **算法**: 链表遍历 + 模拟十进制进位
- **思路**: 相当于把 [Add Binary](./add-binary.md) 换成链表、进位基数换成 10。先建哨兵节点 `r = new ListNode(0)`（`h` 保存头指针，`beforeend` 保存前驱），第一阶段 `while(l1 != null && l2 != null)` 同步走两条链，`r.val += l1.val + l2.val` 后把 `r.val / 10` 作为新节点（进位）挂到 `r.next`，`r.val %= 10`；第二阶段用 `rest` 继续处理较长链表的剩余位，逻辑相同。最后若尾节点是多余的 0 进位（`beforeend.next.val == 0`）就置 `null` 裁掉。
- **复杂度**: 时间 O(max(m, n))，空间 O(max(m, n))（结果链表）
