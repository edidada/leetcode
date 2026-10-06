# Power of Two

- **对应程序**: `power-of-two/Solution.java`
- **算法**: 递归（整除折半判定）
- **思路**: 递归地把 `n` 除以 2：`n == 0` 返回 false，`n == 1` 返回 true，若 `n % 2 == 1`（含负奇数）返回 false，否则递归 `isPowerOfTwo(n / 2)`。即反复折半，最终能恰好归 1 的数才是 2 的幂。
- **复杂度**: 时间 O(log n)，空间 O(log n)（递归栈）
