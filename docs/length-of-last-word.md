# Length of Last Word

- **对应程序**: `length-of-last-word/Solution.java`
- **算法**: 字符串扫描（双指针）
- **思路**: 先把字符串转为字符数组，从尾部用 `upper` 指针回退跳过所有空格；然后从头扫到 `upper`，遇非空格字符 `len++`、遇空格 `len` 清零，扫完时 `len` 恰好是最后一个单词的长度。
- **复杂度**: 时间 O(n)；空间 O(n)（`toCharArray` 拷贝）
