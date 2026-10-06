# Remove Duplicates from Sorted Array

- **对应程序**: `remove-duplicates-from-sorted-array/Solution.java`
- **算法**: 原地去重（单写指针 len，内层回填）
- **思路**: 利用有序性，`len` 记录已去重段的长度，从 `i = 1` 起扫描：当 `A[i] != A[i-1]` 说明出现新值，用内层循环 `for(j = i-1; j > len-1; j--) A[j] = A[i]` 把中间被跳过的重复段用当前值覆盖压实，然后 `len++`。等价于双指针压缩，只是这段实现通过逐位回填完成。返回 `len`。
- **复杂度**: 时间 O(n)（内层回填总次数不超过 n），空间 O(1)
