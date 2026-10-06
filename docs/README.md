# 算法文档索引

各题目目录下可执行程序（`<目录>/Solution.java`）对应算法的说明，共 248 篇。

| 题目 | 核心算法 |
| --- | --- |
| [3Sum](3sum.md) | 排序 + 双指针夹逼（中间线性扫描） |
| [3Sum Closest](3sum-closest.md) | 排序 + 双指针夹逼（中间线性扫描） |
| [4Sum](4sum.md) | 哈希表缓存「两数之和」（空间换时间）+ 组合枚举 |
| [Add and Search Word - Data structure design](add-and-search-word-data-structure-design.md) | 前缀树 Trie + DFS 回溯 |
| [Add Binary](add-binary.md) | 模拟竖式加法（按位进位） |
| [Add Digits](add-digits.md) | 数学公式（数字根 digital root） |
| [Add Two Numbers](add-two-numbers.md) | 链表遍历 + 模拟十进制进位 |
| [Anagrams](anagrams.md) | 排序规范化 + 哈希分组 |
| [Balanced Binary Tree](balanced-binary-tree.md) | 递归 DFS（自顶向下，重复计算高度） |
| [Basic Calculator](basic-calculator.md) | 调度场算法（中缀转逆波兰 RPN）+ 栈求值 |
| [Basic Calculator II](basic-calculator-ii.md) | 调度场算法（中缀转逆波兰 RPN）+ 栈求值 |
| [Best Time to Buy and Sell Stock](best-time-to-buy-and-sell-stock.md) | 一次遍历（前缀最小值 + 贪心） |
| [Best Time to Buy and Sell Stock II](best-time-to-buy-and-sell-stock-ii.md) | 贪心（累加所有正向差价） |
| [Best Time to Buy and Sell Stock III](best-time-to-buy-and-sell-stock-iii.md) | 动态规划（左右两次扫描 + 枚举分割点） |
| [Best Time to Buy and Sell Stock IV](best-time-to-buy-and-sell-stock-iv.md) | 动态规划（持有/未持有双状态 + 差分数组） |
| [Binary Search Tree Iterator](binary-search-tree-iterator.md) | 显式栈模拟递归的中序遍历（协程式返回地址状态机） |
| [Binary Tree Inorder Traversal](binary-tree-inorder-traversal.md) | 显式栈模拟递归（状态机式非递归中序遍历） |
| [Binary Tree Level Order Traversal](binary-tree-level-order-traversal.md) | BFS（队列 + 层末哨兵） |
| [Binary Tree Level Order Traversal II](binary-tree-level-order-traversal-ii.md) | BFS（队列 + 层末哨兵）+ 头插逆序输出 |
| [Binary Tree Maximum Path Sum](binary-tree-maximum-path-sum.md) | 后序 DFS（自底向上贡献值 + 全局最大值） |
| [Binary Tree Paths](binary-tree-paths.md) | 递归 DFS（分治 + Stream 字符串映射） |
| [Binary Tree Postorder Traversal](binary-tree-postorder-traversal.md) | 显式栈模拟递归（状态机式非递归后序遍历） |
| [Binary Tree Preorder Traversal](binary-tree-preorder-traversal.md) | 显式栈模拟递归（状态机式非递归前序遍历） |
| [Binary Tree Right Side View](binary-tree-right-side-view.md) | 递归 DFS（分治合并子树视图） |
| [Binary Tree Upside Down](binary-tree-upside-down.md) | 中序遍历 DFS + 队列重挂 |
| [Binary Tree Zigzag Level Order Traversal](binary-tree-zigzag-level-order-traversal.md) | BFS（队列 + 层末哨兵）+ 方向标志双端插入 |
| [Bitwise AND of Numbers Range](bitwise-and-of-numbers-range.md) | 位运算分治递归（按最高公共二进制位） |
| [Candy](candy.md) | 贪心（左右两遍扫描） |
| [Climbing Stairs](climbing-stairs.md) | 动态规划（斐波那契递推，自底向上填表） |
| [Clone Graph](clone-graph.md) | BFS 广度优先遍历（两趟：先克隆顶点，再连接边） |
| [Closest Binary Search Tree Value](closest-binary-search-tree-value.md) | 递归 DFS（全树遍历比较，未利用 BST 剪枝） |
| [Combination Sum](combination-sum.md) | 回溯（DFS） |
| [Combination Sum II](combination-sum-ii.md) | 回溯（DFS）+ 哈希去重 |
| [Combination Sum III](combination-sum-iii.md) | 回溯（DFS）+ 剪枝 |
| [Combinations](combinations.md) | 回溯（DFS） |
| [Compare Version Numbers](compare-version-numbers.md) | 字符串处理（分段补齐 + 逐位比较） |
| [Construct Binary Tree from Inorder and Postorder Traversal](construct-binary-tree-from-inorder-and-postorder-traversal.md) | 分治（递归建树） |
| [Construct Binary Tree from Preorder and Inorder Traversal](construct-binary-tree-from-preorder-and-inorder-traversal.md) | 分治（递归建树） |
| [Container With Most Water](container-with-most-water.md) | 双指针（贪心） |
| [Contains Duplicate](contains-duplicate.md) | 哈希集合去重 |
| [Contains Duplicate II](contains-duplicate-ii.md) | 哈希表（值 -> 下标列表） |
| [Contains Duplicate III](contains-duplicate-iii.md) | 滑动窗口 + 平衡二叉搜索树（TreeMap） |
| [Convert Sorted Array to Binary Search Tree](convert-sorted-array-to-binary-search-tree.md) | 分治（递归建树） |
| [Convert Sorted List to Binary Search Tree](convert-sorted-list-to-binary-search-tree.md) | 分治 + 快慢指针找中点 |
| [Copy List with Random Pointer](copy-list-with-random-pointer.md) | 哈希表映射（原节点 -> 克隆节点） |
| [Count and Say](count-and-say.md) | 迭代 + 字符串游程编码 |
| [Count Complete Tree Nodes](count-complete-tree-nodes.md) | 完全二叉树性质 + 递归计数 |
| [Count Primes](count-primes.md) | 埃拉托斯特尼筛法（BitSet） |
| [Count Univalue Subtrees](count-univalue-subtrees.md) | DFS（后序递归） |
| [Course Schedule](course-schedule.md) | 拓扑排序（反复删除汇点判环） |
| [Course Schedule II](course-schedule-ii.md) | 拓扑排序（输出修课顺序） |
| [Decode Ways](decode-ways.md) | 动态规划（一维滚动数组） |
| [Delete Node in a Linked List](delete-node-in-a-linked-list.md) | 链表技巧（值覆盖删除） |
| [Different Ways to Add Parentheses](different-ways-to-add-parentheses.md) | 分治递归（卡特兰式枚举） |
| [Distinct Subsequences](distinct-subsequences.md) | 动态规划（二维 DP） |
| [Divide Two Integers](divide-two-integers.md) | 快速减法（指数倍增）+ 递归处理边界 |
| [Dungeon Game](dungeon-game.md) | 动态规划（从终点逆向推） |
| [Edit Distance](edit-distance.md) | 动态规划（Levenshtein 编辑距离） |
| [Encode and Decode Strings](encode-and-decode-strings.md) | 长度前缀编码（定宽十六进制头） |
| [Evaluate Reverse Polish Notation](evaluate-reverse-polish-notation.md) | 栈模拟 |
| [Excel Sheet Column Number](excel-sheet-column-number.md) | 进制转换（26 进制按权展开） |
| [Excel Sheet Column Title](excel-sheet-column-title.md) | 递归（26 进制转换，处理无零表示） |
| [Factor Combinations](factor-combinations.md) | 回溯 / 递归分治 |
| [Factorial Trailing Zeroes](factorial-trailing-zeroes.md) | 数学模拟（质因子计数） |
| [Find Minimum in Rotated Sorted Array](find-minimum-in-rotated-sorted-array.md) | 二分查找（递归） |
| [Find Minimum in Rotated Sorted Array II](find-minimum-in-rotated-sorted-array-ii.md) | 二分查找（递归，含重复元素） |
| [Find Peak Element](find-peak-element.md) | 分治（递归求区间最大者） |
| [First Bad Version](first-bad-version.md) | 二分查找 |
| [First Missing Positive](first-missing-positive.md) | 原地哈希（桶排序式放置） |
| [Flatten 2D Vector](flatten-2d-vector.md) | 迭代器设计（双层迭代器 + 惰性推进） |
| [Flatten Binary Tree to Linked List](flatten-binary-tree-to-linked-list.md) | DFS（前序遍历） |
| [Fraction to Recurring Decimal](fraction-to-recurring-decimal.md) | 模拟长除法 + 哈希表检测循环 |
| [Gas Station](gas-station.md) | 贪心（一次扫描） |
| [Generate Parentheses](generate-parentheses.md) | 递归构造 + HashSet 去重 |
| [Gray Code](gray-code.md) | 位运算公式法 |
| [Happy Number](happy-number.md) | 模拟 + HashSet 环检测 |
| [House Robber](house-robber.md) | 动态规划（线性 DP） |
| [House Robber II](house-robber-ii.md) | 动态规划（环状拆成两次线性 DP） |
| [Implement Queue using Stacks](implement-queue-using-stacks.md) | 数据结构设计（单栈 + 代价放在 push） |
| [Implement Stack using Queues](implement-stack-using-queues.md) | 数据结构设计（队列 + 代价放在 push） |
| [Implement strStr()](implement-strstr.md) | KMP 风格单模式匹配（自建部分匹配表做跳跃） |
| [Implement Trie (Prefix Tree)](implement-trie-prefix-tree.md) | 字典树（Trie，递归插入/查询） |
| [Inorder Successor in BST](inorder-successor-in-bst.md) | BST 性质 + 递归查找 |
| [Insert Interval](insert-interval.md) | 线性查找插入位置 + 合并区间 |
| [Insertion Sort List](insertion-sort-list.md) | 插入排序（链表版） |
| [Integer to Roman](integer-to-roman.md) | 贪心（大符号优先）+ 回溯缓冲处理减法式写法 |
| [Interleaving String](interleaving-string.md) | 动态规划（二维布尔 DP，类似 Unique Paths 走矩阵） |
| [Intersection of Two Linked Lists](intersection-of-two-linked-lists.md) | 双指针（先测长度对齐再同速前进） |
| [Invert Binary Tree](invert-binary-tree.md) | DFS（递归） |
| [Isomorphic Strings](isomorphic-strings.md) | 哈希映射（定长数组存字符映射，双向验证） |
| [Jump Game](jump-game.md) | 贪心（维护最大可达位置） |
| [Jump Game II](jump-game-ii.md) | 贪心（逐"层"扩展最远 reach，README 形容其形似 Prim 算法） |
| [Kth Largest Element in an Array](kth-largest-element-in-an-array.md) | 堆（手写大小为 k 的最小堆） |
| [Kth Smallest Element in a BST](kth-smallest-element-in-a-bst.md) | 中序遍历（DFS）+ 提前终止 |
| [Largest Number](largest-number.md) | 自定义比较器排序 |
| [Largest Rectangle in Histogram](largest-rectangle-in-histogram.md) | 单调栈 |
| [Length of Last Word](length-of-last-word.md) | 字符串扫描（双指针） |
| [Letter Combinations of a Phone Number](letter-combinations-of-a-phone-number.md) | 回溯（DFS） |
| [Linked List Cycle](linked-list-cycle.md) | 快慢指针（Floyd 判圈） |
| [Linked List Cycle II](linked-list-cycle-ii.md) | 快慢指针（Floyd 判圈） |
| [Longest Common Prefix](longest-common-prefix.md) | 纵向逐列比较（暴力扫描） |
| [Longest Consecutive Sequence](longest-consecutive-sequence.md) | 哈希集合 + 双向扩散 |
| [Longest Palindromic Substring](longest-palindromic-substring.md) | 动态规划（按子串长度枚举） |
| [Longest Substring with At Most Two Distinct Characters](longest-substring-with-at-most-two-distinct-characters.md) | 滑动窗口（双指针 + 计数表） |
| [Longest Substring Without Repeating Characters](longest-substring-without-repeating-characters.md) | 双指针 + 循环不变量（barrier） |
| [Longest Valid Parentheses](longest-valid-parentheses.md) | 栈 + 计数数组 |
| [Lowest Common Ancestor of a Binary Search Tree](lowest-common-ancestor-of-a-binary-search-tree.md) | BST 性质 + 迭代下降 |
| [Lowest Common Ancestor of a Binary Tree](lowest-common-ancestor-of-a-binary-tree.md) | DFS（中序遍历 + 子树包含判断） |
| [LRU Cache](lru-cache.md) | 手写哈希表（链地址法）+ 双向链表 |
| [Majority Element](majority-element.md) | Boyer-Moore 多数投票 |
| [Majority Element II](majority-element-ii.md) | Boyer-Moore 投票推广（两候选抵消） |
| [Max Points on a Line](max-points-on-a-line.md) | 暴力枚举（直线对象 + 叉积共线判断） |
| [Maximal Rectangle](maximal-rectangle.md) | 归约为直方图最大矩形 + 单调栈 |
| [Maximal Square](maximal-square.md) | 暴力枚举（由左上角向外扩边） |
| [Maximum Depth of Binary Tree](maximum-depth-of-binary-tree.md) | DFS（递归分治） |
| [Maximum Gap](maximum-gap.md) | 桶排序思想（抽屉原理） |
| [Maximum Product Subarray](maximum-product-subarray.md) | 动态规划（双状态滚动） |
| [Maximum Subarray](maximum-subarray.md) | 动态规划（Kadane 算法） |
| [Median of Two Sorted Arrays](median-of-two-sorted-arrays.md) | 二分查找（求两有序数组第 k 小） |
| [Meeting Rooms](meeting-rooms.md) | 排序 + 线性扫描 |
| [Meeting Rooms II](meeting-rooms-ii.md) | 排序 + 贪心分配 |
| [Merge Intervals](merge-intervals.md) | 排序 + 栈式合并 |
| [Merge k Sorted Lists](merge-k-sorted-lists.md) | 分治（两两归并） |
| [Merge Sorted Array](merge-sorted-array.md) | 归并（逆向双指针） |
| [Merge Two Sorted Lists](merge-two-sorted-lists.md) | 链表双指针归并 |
| [Min Stack](min-stack.md) | 辅助栈（双栈设计） |
| [Minimum Depth of Binary Tree](minimum-depth-of-binary-tree.md) | 递归 DFS（分治） |
| [Minimum Path Sum](minimum-path-sum.md) | 动态规划（原地滚动） |
| [Minimum Size Subarray Sum](minimum-size-subarray-sum.md) | 滑动窗口（双指针） |
| [Minimum Window Substring](minimum-window-substring.md) | 滑动窗口 + 计数数组 |
| [Missing Number](missing-number.md) | 原地置换排序（值-下标归位） |
| [Missing Ranges](missing-ranges.md) | 区间扫描（一次遍历） |
| [Move Zeroes](move-zeroes.md) | 原地分段左移（从右向左扫描） |
| [Multiply Strings](multiply-strings.md) | 模拟竖式乘法（大数按位数组） |
| [N-Queens](n-queens.md) | 回溯（逐行 DFS + 剪枝） |
| [N-Queens II](n-queens-ii.md) | 回溯（逐行 DFS + 剪枝） |
| [Next Permutation](next-permutation.md) | 原地扫描（下一个排列的标准算法） |
| [Number of 1 Bits](number-of-1-bits.md) | 位运算（并行分治计数 / population count） |
| [Number of Digit One](number-of-digit-one.md) | 按位分治递归 + HashMap 记忆化 |
| [Number of Islands](number-of-islands.md) | DFS（洪水填充 / 连通块计数） |
| [One Edit Distance](one-edit-distance.md) | 双指针一次扫描 |
| [Paint House](paint-house.md) | 动态规划（三状态） |
| [Palindrome Linked List](palindrome-linked-list.md) | 快慢指针 + 链表反转 |
| [Palindrome Number](palindrome-number.md) | 数学位提取（首尾对称比较） |
| [Palindrome Partitioning](palindrome-partitioning.md) | 回溯 / 递归枚举 |
| [Palindrome Partitioning II](palindrome-partitioning-ii.md) | 动态规划（回文预处理表 + 一维最少切割） |
| [Palindrome Permutation](palindrome-permutation.md) | 哈希计数（奇偶性判断） |
| [Palindrome Permutation II](palindrome-permutation-ii.md) | 哈希配对 + 递归全排列（回溯） |
| [Partition List](partition-list.md) | 链表双子链拼接（哑节点分区） |
| [Pascal's Triangle](pascals-triangle.md) | 动态规划（逐行递推） |
| [Pascal's Triangle II](pascals-triangle-ii.md) | 动态规划（一维数组原地滚动） |
| [Path Sum](path-sum.md) | DFS（递归，路径和逐层作差） |
| [Path Sum II](path-sum-ii.md) | DFS（递归携带父路径，回溯收集所有解） |
| [Peeking Iterator](peeking-iterator.md) | 装饰器模式（单元素预读缓冲） |
| [Permutation Sequence](permutation-sequence.md) | 康托展开逆运算（阶乘数制定数位） |
| [Permutations](permutations.md) | 递归/回溯（分治式全排列枚举） |
| [Permutations II](permutations-ii.md) | 排序 + 下一个排列（nextPermutation）迭代枚举 |
| [Plus One](plus-one.md) | 模拟大数加法（逐位进位） |
| [Populating Next Right Pointers in Each Node](populating-next-right-pointers-in-each-node.md) | DFS（利用完全二叉树性质的递归连接） |
| [Populating Next Right Pointers in Each Node II](populating-next-right-pointers-in-each-node-ii.md) | DFS + 沿已建 next 链寻找后继（一般二叉树层序链接） |
| [Power of Two](power-of-two.md) | 递归（整除折半判定） |
| [Pow(x, n)](powx-n.md) | 快速幂（分治递归） |
| [Product of Array Except Self](product-of-array-except-self.md) | 前缀积 + 后缀积（两遍扫描，不用除法） |
| [Read N Characters Given Read4](read-n-characters-given-read4.md) | 模拟（循环调用 read4 并截断拷贝） |
| [Read N Characters Given Read4 II - Call multiple times](read-n-characters-given-read4-ii-call-multiple-times.md) | 模拟 + 缓冲区缓存（队列暂存多余字符） |
| [Recover Binary Search Tree](recover-binary-search-tree.md) | 中序遍历（BST）+ 记录逆序对 |
| [Rectangle Area](rectangle-area.md) | 几何计算（容斥：两矩形面积和减重叠面积） |
| [Regular Expression Matching](regular-expression-matching.md) | 自动机（NFA 构造 + 子集构造法转 DFA 后模拟匹配），非动态规划 |
| [Remove Duplicates from Sorted Array](remove-duplicates-from-sorted-array.md) | 原地去重（单写指针 len，内层回填） |
| [Remove Duplicates from Sorted Array II](remove-duplicates-from-sorted-array-ii.md) | 原地去重（写指针 + 重复计数，允许保留两个） |
| [Remove Duplicates from Sorted List](remove-duplicates-from-sorted-list.md) | 链表遍历（保留首个重复值，跳过后继重复） |
| [Remove Duplicates from Sorted List II](remove-duplicates-from-sorted-list-ii.md) | 链表递归（删除全部重复节点） |
| [Remove Element](remove-element.md) | 双指针（读 i / 写 len 压实） |
| [Remove Linked List Elements](remove-linked-list-elements.md) | 链表递归删除 |
| [Remove Nth Node From End of List](remove-nth-node-from-end-of-list.md) | 双指针（快慢指针保持固定间距） |
| [Reorder List](reorder-list.md) | 快慢指针找中点 + 链表反转 + 交叉合并 |
| [Repeated DNA Sequences](repeated-dna-sequences.md) | 基数编码 + 计数数组（哈希/直接寻址） |
| [Restore IP Addresses](restore-ip-addresses.md) | 回溯/DFS（枚举分段） |
| [Reverse Bits](reverse-bits.md) | 位运算（分治交换，直接移植 JDK `Integer.reverse`） |
| [Reverse Integer](reverse-integer.md) | 数学模拟（逐位取模翻转 + 溢出预检） |
| [Reverse Linked List](reverse-linked-list.md) | 链表递归反转 |
| [Reverse Linked List II](reverse-linked-list-ii.md) | 链表局部反转（一次遍历 + 头插式改链） |
| [Reverse Nodes in k-Group](reverse-nodes-in-k-group.md) | 链表分组反转（递归 + 迭代 reverse） |
| [Reverse Words in a String](reverse-words-in-a-string.md) | 字符串分割 + 列表反转 |
| [Reverse Words in a String II](reverse-words-in-a-string-ii.md) | 双指针原地翻转（整体反转 + 逐词反转） |
| [Roman to Integer](roman-to-integer.md) | 线性扫描（查表累加 + 减法式表示修正） |
| [Rotate Array](rotate-array.md) | 循环置换（Cycle Replacement，利用 GCD 分环） |
| [Rotate Image](rotate-image.md) | 原地矩阵变换（反对角线翻转 + 上下翻转） |
| [Rotate List](rotate-list.md) | 链表成环 + 快慢定位断环 |
| [Same Tree](same-tree.md) | 二叉树递归 DFS |
| [Scramble String](scramble-string.md) | 分治递归 + 基于字符计数的队列剪枝 |
| [Search a 2D Matrix](search-a-2d-matrix.md) | 二分查找（一维映射） |
| [Search a 2D Matrix II](search-a-2d-matrix-ii.md) | 二维分治递归（四分象限） |
| [Search for a Range](search-for-a-range.md) | 二分查找 + 线性向两侧扩展 |
| [Search in Rotated Sorted Array](search-in-rotated-sorted-array.md) | 变形二分查找 |
| [Search in Rotated Sorted Array II](search-in-rotated-sorted-array-ii.md) | 变形二分查找（含重复元素退化处理） |
| [Search Insert Position](search-insert-position.md) | 线性扫描（顺序查找） |
| [Set Matrix Zeroes](set-matrix-zeroes.md) | 原地标记（首行/首列作 bitmap） |
| [Shortest Palindrome](shortest-palindrome.md) | 双指针扫描 + 后缀回文计数数组（自造 KMP 替代） |
| [Shortest Word Distance](shortest-word-distance.md) | 一次遍历双指针（记录最近下标） |
| [Simplify Path](simplify-path.md) | 字符串分割 + 栈（逆序遍历） |
| [Single Number](single-number.md) | 位运算异或 |
| [Single Number II](single-number-ii.md) | 逐位计数（模 3 消去） |
| [Single Number III](single-number-iii.md) | 位运算分组异或 |
| [Sliding Window Maximum](sliding-window-maximum.md) | 单调递减双端队列（Monotonic Deque） |
| [Sort Colors](sort-colors.md) | 荷兰国旗三向切分（Dutch National Flag，三指针） |
| [Sort List](sort-list.md) | 链表归并排序（快慢指针找中点 + 有序合并） |
| [Spiral Matrix](spiral-matrix.md) | 边界收缩模拟（按圈顺时针遍历） |
| [Spiral Matrix II](spiral-matrix-ii.md) | 边界收缩模拟（按圈螺旋填充） |
| [Sqrt(x)](sqrtx.md) | 二分查找（对 `m+1` 与 `m+2` 双试探） |
| [String to Integer (atoi)](string-to-integer-atoi.md) | 字符串线性解析 + 溢出截断 |
| [Strobogrammatic Number](strobogrammatic-number.md) | 双指针回文式判定 |
| [Subsets](subsets.md) | 位掩码枚举子集（Bitmask） |
| [Subsets II](subsets-ii.md) | 位掩码枚举 + HashSet 去重 |
| [Substring with Concatenation of All Words](substring-with-concatenation-of-all-words.md) | 滑动起点 + 词表计数校验（暴力 + HashMap） |
| [Sudoku Solver](sudoku-solver.md) | 回溯 DFS（候选集剪枝） |
| [Sum Root to Leaf Numbers](sum-root-to-leaf-numbers.md) | 二叉树递归 DFS（携带前缀值） |
| [Summary Ranges](summary-ranges.md) | 一次遍历（顺序扫描） |
| [Surrounded Regions](surrounded-regions.md) | BFS（边界洪水填充） |
| [Swap Nodes in Pairs](swap-nodes-in-pairs.md) | 递归 |
| [Symmetric Tree](symmetric-tree.md) | BFS（层序遍历 + 回文判定） |
| [Text Justification](text-justification.md) | 贪心（模拟排版） |
| [The Skyline Problem](the-skyline-problem.md) | 扫描线 + 区间归并（配合优先队列） |
| [Trapping Rain Water](trapping-rain-water.md) | 双端队列（单调结构）+ 分治递归 |
| [Triangle](triangle.md) | 动态规划（自底向上，滚动数组） |
| [Two Sum](two-sum.md) | 哈希表 |
| [Two Sum II - Input array is sorted](two-sum-ii-input-array-is-sorted.md) | 双指针 |
| [Two Sum III - Data structure design](two-sum-iii-data-structure-design.md) | 哈希表（数据结构设计） |
| [Unique Binary Search Trees](unique-binary-search-trees.md) | 递归（Catalan 数） |
| [Unique Binary Search Trees II](unique-binary-search-trees-ii.md) | 递归 + 笛卡尔积（分治构造） |
| [Unique Paths](unique-paths.md) | 动态规划（二维表） |
| [Unique Paths II](unique-paths-ii.md) | 动态规划（原地覆盖输入网格） |
| [Valid Anagram](valid-anagram.md) | 排序 |
| [Valid Number](valid-number.md) | 有限状态扫描（标志位模拟 DFA） |
| [Valid Palindrome](valid-palindrome.md) | 双指针 |
| [Valid Parentheses](valid-parentheses.md) | 栈 |
| [Valid Sudoku](valid-sudoku.md) | 哈希集合去重 |
| [Validate Binary Search Tree](validate-binary-search-tree.md) | 中序遍历（DFS） |
| [Verify Preorder Sequence in Binary Search Tree](verify-preorder-sequence-in-binary-search-tree.md) | 排序 + 二分 + 栈模拟区间 |
| [Wildcard Matching](wildcard-matching.md) | 贪心 + 断点回溯（双指针） |
| [Word Break](word-break.md) | 动态规划（一维布尔表） |
| [Word Break II](word-break-ii.md) | 动态规划 + 回溯（父指针记录） |
| [Word Ladder](word-ladder.md) | BFS（分层） |
| [Word Ladder II](word-ladder-ii.md) | BFS + 路径回溯（Trace 链表） |
| [Word Search](word-search.md) | DFS（回溯）+ 显式路径栈 |
| [Word Search II](word-search-ii.md) | Trie（前缀树）+ DFS 回溯 |
| [ZigZag Conversion](zigzag-conversion.md) | 模拟（在假想纸上按折线写入） |
| [Zigzag Iterator](zigzag-iterator.md) | 轮询双指针（迭代器交替） |
