# Unique Binary Search Trees II

- **对应程序**: `unique-binary-search-trees-ii/Solution.java`
- **算法**: 递归 + 笛卡尔积（分治构造）
- **思路**: `generateTrees(int n)` 先构造有序数组 `1..n`，再交给重载的 `generateTrees(int[] array)`。该递归对每个下标 `i` 取 `array[i]` 为根，用 `Arrays.copyOfRange` 切成左右子数组并各自递归生成所有左、右子树，然后两层 `for` 对左右子树做笛卡尔积组合，挂到新建根上加入结果。空数组返回仅含 `null` 的单元素列表作为基准。
- **复杂度**: 时间 O(n * C_n)（C_n 为第 n 个卡特兰数），空间 O(n * C_n)
