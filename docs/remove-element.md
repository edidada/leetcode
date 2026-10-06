# Remove Element

- **对应程序**: `remove-element/Solution.java`
- **算法**: 双指针（读 i / 写 len 压实）
- **思路**: 遍历数组，写指针 `len` 记录保留段长度：凡 `A[i] != elem` 就执行 `A[len++] = A[i]` 把保留元素依次前移覆盖，等于 `elem` 的直接跳过。一遍扫描后前 `len` 个位置即为结果，返回 `len`。
- **复杂度**: 时间 O(n)，空间 O(1)
