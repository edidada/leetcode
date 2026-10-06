# Next Permutation

- **对应程序**: `next-permutation/Solution.java`
- **算法**: 原地扫描（下一个排列的标准算法）
- **思路**: 从右向左找第一个满足 `num[i] > num[i-1]` 的位置，记 `p = i-1`（升序分界点）；若不存在（整体降序），直接 `Arrays.sort(num)` 升序即最小排列。否则再从右向左找第一个大于 `num[p]` 的元素 `num[c]` 并与 p 交换，最后对 `p+1` 之后的后缀 `Arrays.sort(num, p+1, length)` 升序，得到字典序的下一个排列。
- **复杂度**: 时间 O(n log n)（因用排序处理后缀），空间 O(1)（不计排序栈开销）
