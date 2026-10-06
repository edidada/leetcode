# Contains Duplicate III

- **对应程序**: `contains-duplicate-iii/Solution.java`
- **算法**: 滑动窗口 + 平衡二叉搜索树（TreeMap）
- **思路**: 内部类 Tree 用 `TreeMap<Integer, Integer>`（值->计数）维护一个大小不超过 k 的窗口。每加入 `nums[i]` 后调用 `nearSub`：用 `higherKey`/`lowerKey` 找窗口中与它最接近的两个邻居，差值用 long 计算防溢出，若最小差 `<= t` 则命中；窗口 size 超过 k 时移除左端 `nums[p++]` 实现滑动。
- **复杂度**: 时间 O(n log k)，空间 O(k)
