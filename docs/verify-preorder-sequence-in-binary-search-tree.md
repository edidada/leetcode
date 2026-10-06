# Verify Preorder Sequence in Binary Search Tree

- **对应程序**: `verify-preorder-sequence-in-binary-search-tree/Solution.java`
- **算法**: 排序 + 二分 + 栈模拟区间
- **思路**: 先对 `preorder` 的副本 `inorder` 排序，得到合法 BST 对应的中序序列。用 `LinkedList<Integer> stack` 存成对区间端点 `(st, ed)`，初始压入 `[0, len)`。每次弹出一个区间，取下一个前序值 `root` 作根，用 `Arrays.binarySearch(inorder, st, ed, root)` 在中序中定位；若找不到（`i<0`）说明序列非法返回 `false`。随后把右区间 `[i+1, ed)` 和左区间 `[st, i)` 压回栈，供后续节点继续匹配。全部前序值都成功落入某个区间则合法。
- **复杂度**: 时间 O(n log n)（排序加每次二分），空间 O(n)
