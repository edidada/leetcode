# Word Search

- **对应程序**: `word-search/Solution.java`
- **算法**: DFS（回溯）+ 显式路径栈
- **思路**: 成员数组 `XY[] stack` 充当 DFS 路径栈，记录已选格子坐标。`exist` 遍历棋盘找与 `word[0]` 相符的起点，压入 `stack[0]` 后调用 `search(board, str, 1)`。`search` 从栈顶 `stack[index-1]` 出发枚举上下左右四邻，先用内层 `for` 检查该邻居是否已在路径中（去重），再校验越界与字符匹配，匹配则写入 `stack[index]` 并递归 `index+1`，任一分支成功返回 `true`，否则回溯。走完全部字符（`index>=cs.length`）即命中。
- **复杂度**: 时间 O(m*n*4^L)（L 为词长），空间 O(L)
