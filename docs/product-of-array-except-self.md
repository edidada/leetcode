# Product of Array Except Self

- **对应程序**: `product-of-array-except-self/Solution.java`
- **算法**: 前缀积 + 后缀积（两遍扫描，不用除法）
- **思路**: 第一遍正向扫描把 `output` 填成前缀积（`output[i] = output[i-1] * nums[i]`）；随后把末位改写为 `output[len-2]`（即除去自身的左侧积）。第二遍从右向左用运行变量 `t` 累计右侧元素乘积（后缀积），令 `output[i] = t * output[i-1]`，最后 `output[0] = t`。两遍之后每个位置即为除自身外全部元素的乘积。
- **复杂度**: 时间 O(n)，空间 O(1)（不算输出数组）
