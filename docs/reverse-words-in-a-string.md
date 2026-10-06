# Reverse Words in a String

- **对应程序**: `reverse-words-in-a-string/Solution.java`
- **算法**: 字符串分割 + 列表反转
- **思路**: 对输入先 `trim()` 去掉首尾空格，再用正则 `" +"` 按连续多个空格切分成单词列表（`Arrays.asList(s.trim().split(" +"))`），`Collections.reverse` 原地逆序单词列表（asList 支持 set 操作），最后 `String.join(" ", words)` 以单个空格连接。完全依赖库函数，三步完成。
- **复杂度**: 时间 O(n)，空间 O(n)（分割出的单词列表）
