# Regular Expression Matching

- **对应程序**: `regular-expression-matching/Solution.java`
- **算法**: 自动机（NFA 构造 + 子集构造法转 DFA 后模拟匹配），非动态规划
- **思路**: `nfa` 从模式串尾部向前 Thompson 式构图：普通字符建一条边，`c*` 建 s1–s4 四个节点并以 EPSILON（值为 0 的哨兵字符）边表示零次/多次循环。`dfa` 用子集构造：BFS 状态集合队列，`allEpslilon` 求 epsilon 闭包，`searchTarget` 按字符表 `allchar` 聚出转移，再把状态集合映射为单一 State。最后 `isMatch` 在 DFA 上对字符串逐字符递归推进，匹配结束时检查是否为接受态。
- **复杂度**: 时间：子集构造最坏 O(2^m·m)（m 为模式长度，DFA 状态数为 NFA 幂集），匹配串 O(L)；空间 O(2^m + L)（递归栈 O(L)）
