# Course Schedule

- **对应程序**: `course-schedule/Solution.java`
- **算法**: 拓扑排序（反复删除汇点判环）
- **思路**: 用 Vertex 数组建图，`prerequisites[p]` 中 course 的 out 集合存先修课、先修课的 in 集合存依赖它的课。循环在活跃集合 S 中找 out 为空（sink，即无未处理依赖）的顶点删除，并把指向它的入边对应 out 记录一并移除（continue loop 重新扫描）；若某轮找不到 sink 但 S 非空说明有环返回 false，全部删完返回 true。
- **复杂度**: 时间 O(V^2 + V·E) 量级（每删一顶点都从头遍历集合），空间 O(V + E)
