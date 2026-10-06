# Restore IP Addresses

- **对应程序**: `restore-ip-addresses/Solution.java`
- **算法**: 回溯/DFS（枚举分段）
- **思路**: `findnum(s, p, pstack)` 递归给 IP 的 4 段填值，`stack` 数组临时保存各段。每层尝试从位置 `p` 取 1–3 个字符：越界即 `return`；长度 >1 且首位为 '0' 则 `continue`（剪前导零）；`Integer.parseInt` 后 ≤255 才写入 `stack[pstack]` 并深入。当 `pstack == 4` 且恰好 `p` 到串尾时，用 `String.join(".", stack)` 拼成合法 IP 收入 `collect`。
- **复杂度**: 时间 O(3^4)（常数级分支），空间 O(1)（栈深 4，不计输出）
