# Minimum Window Substring

- **对应程序**: `minimum-window-substring/Solution.java`
- **算法**: 滑动窗口 + 计数数组
- **思路**: 用长度 256 的 `need`/`seen` 数组记录 T 中每字符的需求量与窗口内出现量，`checksum` 统计已满足需求的字符数。右端 `gend` 扩张窗口累加计数；每当 `checksum == t.length`（窗口已覆盖 T），从左端 `gstart` 收缩：跳过非需求字符并丢弃多余重复字符（`seen[i] > need[i]` 时减计数），遇到恰好满足需求的字符即停，再与历史最优区间 `mstart/mend` 比较更新，最后 `S.substring(mstart, mend + 1)` 返回最短窗口。
- **复杂度**: 时间 O(|S| + |T|)，空间 O(1)（计数字组固定 256）
