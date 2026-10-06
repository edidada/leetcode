# Flatten 2D Vector

- **对应程序**: `flatten-2d-vector/Solution.java`（实现类 `Vector2D`，另有同内容副本 `Vector2D.java`）
- **算法**: 迭代器设计（双层迭代器 + 惰性推进）
- **思路**: 维护外层迭代器 `outterIter`（遍历各内层 List）和当前内层迭代器 `innerIter`（初始为空迭代器）。`hasNext()` 先查内层是否还有元素；否则推进外层取下一个内层迭代器并递归调用 `hasNext()`，从而自动跳过空的子列表；`next()` 直接从 `innerIter` 取值。
- **复杂度**: 时间 `next`/`hasNext` 均摊 O(1)；空间 O(1)（仅保存两个迭代器，递归跳过空层深度有限）
