# Course Schedule II

- **对应程序**: `course-schedule-ii/Solution.java`
- **算法**: 拓扑排序（输出修课顺序）
- **思路**: 建图与判环逻辑同 Course Schedule（Vertex 的 in/out 集合 + 反复删除 sink）。每删除一个 sink 就把其 id 加入 `LinkedHashSet<Integer> order`；若有环返回空数组。最后用 `IntStream.range(0, numCourses)` 补入图中未出现的孤立课程（LinkedHashSet 保证去重且追加在后面），再转 int 数组输出。
- **复杂度**: 时间 O(V^2 + V·E) 量级，空间 O(V + E)
