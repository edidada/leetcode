# Divide Two Integers

- **对应程序**: `divide-two-integers/Solution.java`
- **算法**: 快速减法（指数倍增）+ 递归处理边界
- **思路**: 先处理特殊分支：dividend 为 0、Integer.MIN_VALUE（用 `dividend ± divisor` 递归收缩后再补 1，避免 abs 溢出）、divisor 为 MIN_VALUE；符号不同则递归取负统一到正数情形。主循环维护倍增步长 `r`（divisor 的倍数）与倍数 `a`：`r` 不超过被除数时执行 `dividend -= r; quotient += a++; r += divisor`（成倍减），一旦 `r > dividend` 就回退半步（`a--; r -= divisor`）继续尝试。
- **复杂度**: 时间约 O(log^2(商))（倍增减法并回退，远快于朴素逐次相减），空间 O(log) 递归栈（处理 MIN_VALUE 边界），主过程 O(1)
