# Palindrome Partitioning

- **对应程序**: `palindrome-partitioning/Solution.java`
- **算法**: 回溯 / 递归枚举
- **思路**: 递归定义：对串 s 枚举所有前缀切点 i，若前缀 `x = s.substring(0, i+1)` 是回文（`isPal` 首尾双指针检查），则对剩余部分递归 `partition(s.substring(i+1))`；子结果为空说明 x 已是整个剩余串，直接加入 [x]，否则把 x 前置拼接到每个子分区方案上。空串返回空列表、单字符直接返回 [[s]]。
- **复杂度**: 时间 O(n · 2^n)（最坏枚举所有切分），空间 O(n^2) 级递归与字符串拷贝（不计输出）
