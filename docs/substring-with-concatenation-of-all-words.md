# Substring with Concatenation of All Words

- **对应程序**: `substring-with-concatenation-of-all-words/Solution.java`
- **算法**: 滑动起点 + 词表计数校验（暴力 + HashMap）
- **思路**: 先把 `L` 里所有词频次写入模板 `lm`；对 `S` 的每个可能起点 `i`，若 `S.substring(i, i + wordLen)` 属于词表，就取出长度 `wordLen * L.length` 的窗口，把模板 `lm` 拷贝一份传给 `checkCat`——该方法按 `wordLen` 步长切窗口，每次消耗对应词计数一次，只要遇到不在表里或计数已耗尽就返回 `false`；整窗口消耗完则把 `i` 加入结果。若剩余长度不足 `wordLen * L.length` 就 `break`。
- **复杂度**: 时间 O(n · m · k)（n = |S|, m = |L|, k = 词长），空间 O(m · k)
