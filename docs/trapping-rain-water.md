# Trapping Rain Water

- **对应程序**: `trapping-rain-water/Solution.java`
- **算法**: 双端队列（单调结构）+ 分治递归
- **思路**: 用 `Deque<Bar>` 队列存放柱（含位置与高度）。先跳过前导 0，把首个非零柱入队；随后逐个加入新柱并调用 `containWater`：当队尾柱不矮于队头时，以两端较矮高度乘内部宽度计算积水，减去队内中间石柱体积，再移除队头。主扫描结束后，对剩余队列调用 `reverseAndToInt` 反转成数组，递归 `trap` 计算另一侧的积水，两次累加得到总量。
- **复杂度**: 时间 O(n)，空间 O(n)
