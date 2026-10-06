# One Edit Distance

- **对应程序**: `one-edit-distance/Solution.java`
- **算法**: 双指针一次扫描
- **思路**: 先递归交换保证 S 是较短串，长度差超过 1 直接 false。双指针 i、j 同步比较：遇到不等记 `diff++`（超过 1 即 false）；若两串长度不同且 `S[i] == T[j+1]`，说明是删除/插入情形，让 `j++` 跳过 T 的该字符。结束后若从未发现差异（diff==0），需 T 恰好多一个字符（`j+1 == T.length`）才算一步编辑；否则要求两指针都走完（`j == T.length`），即替换情形且长度相等。
- **复杂度**: 时间 O(m+n)，空间 O(m+n)（toCharArray 拷贝）
