# Palindrome Permutation II

- **对应程序**: `palindrome-permutation-ii/Solution.java`
- **算法**: 哈希配对 + 递归全排列（回溯）
- **思路**: 先一遍扫描用集合 `single` 做奇偶配对消消乐：字符已在集合中则移出并把一份放入可成对列表 `chars`，否则加入集合；若最后剩超过 1 个单字符则返回空。否则把剩余单字符作中心 `_single`，对 `chars`（每个字符代表一对）做递归排列 `permute`：每次取一个字符 c 放到子结果两侧（Stream `map(s -> c + s + c)`），用 `HashSet` 去重，天然生成全部回文排列。
- **复杂度**: 时间 O(k! · n)（k 为成对字符种数的排列，输出规模主导），空间 O(n + k!)（不计输出为递归深度 O(n)）
