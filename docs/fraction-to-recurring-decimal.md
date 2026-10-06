# Fraction to Recurring Decimal

- **对应程序**: `fraction-to-recurring-decimal/Solution.java`
- **算法**: 模拟长除法 + 哈希表检测循环
- **思路**: 先用 `Math.signum` 判断符号，再用 long 计算整数部分与初始余数（避免 int 溢出）。小数部分反复执行"余数×10 再除分母"的手算除法，把每步的 `(余数, 商)` 拼成字符串键存入 HashMap 并记录位置；一旦再次出现相同的键说明进入循环，在首次出现的位置插入 `(`、末尾补 `)`。余数为 0 则是有限小数。
- **复杂度**: 时间 O(d)（d 为分母，循环节长度不超过 d），空间 O(d)
