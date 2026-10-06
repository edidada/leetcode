# Copy List with Random Pointer

- **对应程序**: `copy-list-with-random-pointer/Solution.java`
- **算法**: 哈希表映射（原节点 -> 克隆节点）
- **思路**: 第一遍遍历原链表，为每个 `RandomListNode` 创建同 label 的克隆节点并存入 `HashMap<原节点, 克隆节点>`。第二遍再遍历，对每个克隆节点用 map 查出并接上 `islet.next = map.get(iter.next)` 与 `islet.random = map.get(iter.random)`；返回 `map.get(head)`。
- **复杂度**: 时间 O(n)，空间 O(n)
