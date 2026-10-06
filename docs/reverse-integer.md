# Reverse Integer

- **对应程序**: `reverse-integer/Solution.java`
- **算法**: 数学模拟（逐位取模翻转 + 溢出预检）
- **思路**: `x == Integer.MIN_VALUE` 直接返回 0，负数取反递归 `-reverse(-x)`。正数用 do-while 每次 `y = y * 10 + x % 10` 从低位重建翻转数；累积前先检查 `y > (Integer.MAX_VALUE - x % 10) / 10`，若会越界则返回 0，实现溢出保护。
- **复杂度**: 时间 O(log10 x)，空间 O(1)（负数分支额外 O(1) 层递归）
