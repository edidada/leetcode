# Read N Characters Given Read4 II - Call multiple times

- **对应程序**: `read-n-characters-given-read4-ii-call-multiple-times/Solution.java`
- **算法**: 模拟 + 缓冲区缓存（队列暂存多余字符）
- **思路**: 用实例字段 `LinkedList<Character> queue` 跨多次 `read` 调用缓存多余的字符。每次调用循环：调用 `read4` 把读到的字符全部入队，再取 `l = Math.min(n - total, queue.size())` 个字符从队首 poll 进 `buf`；当既读不满也拿不出字符（`l == 0`，即 read4 返回 0 且队列已空）时退出。这样上次没被消费的字符会在下次调用时优先吐出。
- **复杂度**: 时间 O(n + 缓存字符数)，空间 O(f)（队列最多缓存文件规模个字符）
