# Convert Sorted Array to Binary Search Tree

- **对应程序**: `convert-sorted-array-to-binary-search-tree/Solution.java`
- **算法**: 分治（递归建树）
- **思路**: 取有序数组中间元素 `num[mid]` 作为根，用 `Arrays.copyOfRange` 把左右两半复制成子数组，递归调用 `sortedArrayToBST` 分别构建左右子树，从而保证平衡；空数组返回 null，单元素直接建叶节点。
- **复杂度**: 时间 O(n log n)（每层复制子数组共 O(n)，共 log n 层；若改为传下标可为 O(n)），空间 O(n log n)（子数组副本与递归栈）
