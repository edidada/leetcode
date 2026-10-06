# Read N Characters Given Read4

- **对应程序**: `read-n-characters-given-read4/Solution.java`
- **算法**: 模拟（循环调用 read4 并截断拷贝）
- **思路**: 用长度为 4 的临时缓冲 `_buf` 反复调用 `read4`，每轮把实际读到的长度 `l` 截断为 `Math.min(n - total, l)` 再逐个字符拷入目标 `buf` 并累加 `total`；当 `read4` 返回 0（文件读完）时退出循环，返回 `total`。注意实现会继续把剩余文件读空（超出 n 的字符被丢弃不拷贝），只处理单次调用场景。
- **复杂度**: 时间 O(n)（含读空文件的额外 read4 调用），空间 O(1)（4 字符临时缓冲）
