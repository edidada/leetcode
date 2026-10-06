# Happy Number

- **对应程序**: `happy-number/Solution.java`
- **算法**: 模拟 + HashSet 环检测
- **思路**: `trans(n)` 逐位取 `n % 10` 求各位数字的平方和。主循环对 n 反复做该变换：变为 1 返回 true；若变换结果已出现在 `HashSet` 中，说明进入循环（非快乐数）返回 false；否则加入集合并继续。用集合记忆化来代替快慢指针判环。
- **复杂度**: 时间 O(k · log n)（k 为迭代次数，序列长度有界），空间 O(k)
