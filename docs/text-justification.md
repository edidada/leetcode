# Text Justification

- **对应程序**: `text-justification/Solution.java`
- **算法**: 贪心（模拟排版）
- **思路**: 用游标 `p` 贪心地往当前行塞单词：内层 `while(l < L && p < words.length)` 累加单词长度加分隔空格，若超出宽度 `L` 则回退一个单词（`l -= words[--p].length() + 1`）。据此计算本行单词数 `count` 与需填充的空白 `left`，再按 `add = left/(count-1)` 分配词间隙，余数通过 `left` 逐位加一。对 `L==0` 空词、单单词行以及最后一行（`p-1==words.length-1`，词间只留一个空格且末尾右对齐）分别做了特判。`space(len)` 辅助生成长空格串。
- **复杂度**: 时间 O(总字符数)，空间 O(行数*宽度)
