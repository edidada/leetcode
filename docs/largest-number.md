# Largest Number

- **对应程序**: `largest-number/Solution.java`
- **算法**: 自定义比较器排序
- **思路**: 把每个整数转成字符串，用 `(y+x).compareTo(x+y)` 的"拼接字典序"比较器降序排序——即若 `yx > xy` 则 x 应排在 y 前面；排序后直接 `String.join("")` 拼接。若最大元素是 "0"（说明全为零）则特判返回 "0"。
- **复杂度**: 时间 O(n log n · k)，k 为数字平均位数（比较需拼接字符串）；空间 O(n)
