# Symmetric Tree

- **对应程序**: `symmetric-tree/Solution.java`
- **算法**: BFS（层序遍历 + 回文判定）
- **思路**: 用 `nullToEmpty` 把空子节点替换成哨兵 `EMPTY` 占位节点。借助 `queue` 做逐层遍历，并以 `END` 标记每层结束；同时将当前层节点依次收集进 `level`。遇到 `END` 时，用双指针 `pollFirst/pollLast` 从两端比较该层是否为回文：一空一非空或值不等即返回 `false`（两者同为 `EMPTY` 或值相同则通过）。所有层都对称则返回 `true`。
- **复杂度**: 时间 O(n)，空间 O(n)
