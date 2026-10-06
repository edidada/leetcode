# Largest Rectangle in Histogram

- **对应程序**: `largest-rectangle-in-histogram/Solution.java`
- **算法**: 单调栈
- **思路**: 在柱高数组末尾追加一个 0 作为哨兵，遍历每根柱子时用栈保存 `(height, width)` 的 `Rect`。当新柱不高于栈顶时反复弹出栈顶，累计弹出的宽度 `sl` 并用 `left.height * sl` 更新最大值，同时把弹出的宽度合并进新矩形（`r.width = 1 + sl`），表示新柱可以向左扩展；栈为空或更高时直接入栈。
- **复杂度**: 时间 O(n)，每根柱子至多入栈出栈一次；空间 O(n)
