# Dungeon Game

- **对应程序**: `dungeon-game/Solution.java`
- **算法**: 动态规划（从终点逆向推）
- **思路**: 直接在 dungeon 数组上原地 DP，`minHealthReach(hp, room)` 表示进入某房间前至少需要 `hp - room` 点血、且下限为 1。先把公主房（右下角）按初始 1 点血需求算出，再沿最后一列向上、最后一行向左以及由右下往左上逐格填 `dungeon[i][j] = minHealthReach(min(下方, 右方), dungeon[i][j])`，答案即 `dungeon[0][0]`。
- **复杂度**: 时间 O(m * n)，空间 O(1)（原地修改输入数组，不计入额外空间）
