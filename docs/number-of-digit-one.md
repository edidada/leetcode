# Number of Digit One

- **对应程序**: `number-of-digit-one/Solution.java`
- **算法**: 按位分治递归 + HashMap 记忆化
- **思路**: `extractHighest` 用预定义量级表 N 取出最高位 `h` 与最高位对应的整数值 `f`（如 92→h=9,f=90）。递归式 `c = plus + countDigitOne(f-1) + countDigitOne(rest)`：当 h==1 时，最高位这一段额外贡献 `rest+1` 个 1（plus）；`countDigitOne(f-1)` 统计满量级（全 9 形态）下的所有位上的 1；`countDigitOne(rest)` 递归处理余数。边界 n<=0 返回 0、n<10 返回 1，并用 `cache` 缓存子结果。
- **复杂度**: 时间约 O((log n)^2)（记忆化后按量级与余数展开），空间 O((log n)^2)
