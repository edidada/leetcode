# Palindrome Permutation

- **对应程序**: `palindrome-permutation/Solution.java`
- **算法**: 哈希计数（奇偶性判断）
- **思路**: 用 `HashMap<Character, Integer>` 统计每个字符的出现次数，然后遍历所有计数值，统计出现奇数次的字符个数 `single`；回文重排的充要条件是奇数字符不超过 1 个，一旦 `single > 1` 立即返回 false，否则 true。
- **复杂度**: 时间 O(n)，空间 O(n)
