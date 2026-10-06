# Strobogrammatic Number

- **对应程序**: `strobogrammatic-number/Solution.java`
- **算法**: 双指针回文式判定
- **思路**: 预置合法对表 `GOOD_PATTERNS = {{9,6},{6,9},{1,1},{8,8},{0,0}}`；把输入串转成字符数组 `S`，用 `i` 从左、`S.length - 1 - i` 从右同步向中间逼近，每次判断 `S[i]` 与镜像位组成的 `{l, r}` 是否命中某条合法对（`Arrays.equals`），任一不匹配即返回 `false`，循环至中心则返回 `true`。
- **复杂度**: 时间 O(n)，空间 O(n)（字符数组拷贝，若在原串上索引可降至 O(1)）
