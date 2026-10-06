# Palindrome Number

- **对应程序**: `palindrome-number/Solution.java`
- **算法**: 数学位提取（首尾对称比较）
- **思路**: 负数直接 false，0 直接 true。用 `len(x) = (int)Math.log10(x) + 1` 求十进制位数，`charAt(x, i) = (x / Math.pow(10, i)) % 10` 取出从低位数第 i 位；只遍历前半段 `i < l/2`，比较第 i 低位与第 `l-i-1` 高位（即对称位），不等即 false。实现基于浮点 Math.log10/Math.pow 做取位。
- **复杂度**: 时间 O(d)（d 为十进制位数），空间 O(1)
