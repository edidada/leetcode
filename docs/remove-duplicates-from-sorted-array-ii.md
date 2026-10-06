# Remove Duplicates from Sorted Array II

- **对应程序**: `remove-duplicates-from-sorted-array-ii/Solution.java`
- **算法**: 原地去重（写指针 + 重复计数，允许保留两个）
- **思路**: 在有序数组上扫描，`lastseencount` 统计当前值已连续重复的次数，`len` 为保留段长度。当值变化 `A[i] != A[i-1]` 时，用内层循环把 `A[i]` 回填到 `[len + min(lastseencount,1), i)` 的空隙，即每组最多保留原值加上一次重复（共两个），随后 `len += min(lastseencount,1) + 1` 并清零计数。循环结束后返回 `len + min(lastseencount,1)` 处理最后一组。
- **复杂度**: 时间 O(n)，空间 O(1)
