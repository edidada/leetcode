# Word Break II

- **对应程序**: `word-break-ii/Solution.java`
- **算法**: 动态规划 + 回溯（父指针记录）
- **思路**: 相比 Word Break 把布尔 DP 换成父指针表：`ArrayList<Integer>[] P`，`P[i+1]` 收集所有能把前缀切到位置 `i` 的合法起点 `j`（要求 `P[j]!=null` 且子串 `new String(S,j,i-j+1)` 命中字典）。DP 填完后，若终点 `P[S.length]` 非空则调用 `joinAll` 从 `S.length` 递归回溯，沿 `P[offset]` 中的每个父点 `p` 用 `parents.push(new String(S,p,offset-p))` 记录单词段，到 `P[offset]` 为空时用 `String.join(" ", parents)` 拼出一条完整切分方案加入 `rt`，随后 `pop` 撤销实现回溯枚举全部解。
- **复杂度**: 时间取决于解的数量（最坏指数级），空间 O(n^2 + 解集)
