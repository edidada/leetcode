# Find Minimum in Rotated Sorted Array II

- **对应程序**: `find-minimum-in-rotated-sorted-array-ii/Solution.java`
- **算法**: 二分查找（递归，含重复元素）
- **思路**: 在无重复版本的三分法基础上新增一个 "bad case"：当 `num[s] == num[m] == num[e-1]` 时无法二分判断，退化为比较 `num[s]` 与递归子区间 `[s+1, e)` 的最小值。其余情况用带等号的比较（`<=`/`>=`）沿左半或右半递归切分（`Arrays.copyOfRange`）。
- **复杂度**: 时间最坏 O(n)（全部相等时每次只缩小一端），一般 O(log n)；空间 O(n)（切片副本）
