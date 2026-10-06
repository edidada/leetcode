# Two Sum II - Input array is sorted

- **对应程序**: `two-sum-ii-input-array-is-sorted/Solution.java`
- **算法**: 双指针
- **思路**: 利用数组已排序性质，指针 `i` 从头、`j` 从尾向中间夹逼。当 `numbers[i]+numbers[j] > target` 时右指针左移 `j--`，小于时左指针右移 `i++`，相等则返回 1 基下标 `{i+1, j+1}`；循环结束仍未命中抛异常。
- **复杂度**: 时间 O(n)，空间 O(1)
