# ZigZag Conversion

- **对应程序**: `zigzag-conversion/Solution.java`
- **算法**: 模拟（在假想纸上按折线写入）
- **思路**: `nRows==1` 直接返回原串。按注释公式估算列数 `nCols=(nRows-1)*(len/(2*nRows-2)+1)`，开 `char[][] paper`。用游标 `pr,pc` 与方向标志 `direction` 逐字符落子：到达顶行 `pr==0` 或底行 `pr==nRows-1` 时翻转方向；向下只 `pr++`，向上则 `pr--` 且 `pc++` 走对角。最后按行优先（外层 `i` 行、内层 `j` 列）收集非零字符拼成结果串。
- **复杂度**: 时间 O(n * nRows)（含扫描纸面），空间 O(nRows * nCols)
