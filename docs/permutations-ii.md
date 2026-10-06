# Permutations II

- **对应程序**: `permutations-ii/Solution.java`
- **算法**: 排序 + 下一个排列（nextPermutation）迭代枚举
- **思路**: 先对 `num` 排序得到最小排列并存入结果，然后反复调用 `nextPermutation` 生成字典序下一个排列直到耗尽。`nextPermutation` 从右往左找升序支点 `p`，再找最右侧大于 `num[p]` 的元素交换，最后 `Arrays.sort` 重排 `p+1` 之后的后缀；已是最大排列时整体排序并返回 false。天然跳过重复值，保证结果唯一。
- **复杂度**: 时间 O(n·n!)（每个排列生成约 O(n)），空间 O(n·n!)（存放结果）
