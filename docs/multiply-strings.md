# Multiply Strings

- **对应程序**: `multiply-strings/Solution.java`
- **算法**: 模拟竖式乘法（大数按位数组）
- **思路**: 用长度 `num1.length() + num2.length()` 的整型数组 `paper` 模拟竖式：双重循环把每对数字乘积累加到对应位 `paper[paper.length - (i+j+2)]`（下标 0 为最低位，暂不处理进位）。随后从低位向高位做一次进位归一化 `paper[i+1] += paper[i]/10; paper[i] %= 10`。最后从最高位向低位拼接字符串，跳过前导 0（但保留末位 `paper[0]`，保证 "0" 的输出）。
- **复杂度**: 时间 O(mn)，空间 O(m+n)
