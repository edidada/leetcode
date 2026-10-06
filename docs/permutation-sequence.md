# Permutation Sequence

- **对应程序**: `permutation-sequence/Solution.java`
- **算法**: 康托展开逆运算（阶乘数制定数位）
- **思路**: 先把字符 '1'..'n' 放入候选列表 chars，并将 k 转为 0 基（`k -= 1`）。从 i = n-1 递减到 1：以 `f = fact(i)` 为块大小，商 `c = k / f` 指示当前位应取候选列表中第 c 个字符，取出后 `chars.remove(c)` 并令 `k %= f` 进入子块；最后一位直接放剩下的唯一字符，拼成第 k 个排列字符串。
- **复杂度**: 时间 O(n^2)（每步 ArrayList.remove 为 O(n)），空间 O(n)
