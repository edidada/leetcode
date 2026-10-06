# Sort Colors

- **对应程序**: `sort-colors/Solution.java`
- **算法**: 荷兰国旗三向切分（Dutch National Flag，三指针）
- **思路**: 维护 `red`、`white`、`blue` 三个指针：`A[white] == 0` 就与 `A[red]` 交换并让两者都右移，`== 1` 就 `white++`，`== 2` 就与 `A[blue]` 交换并 `blue--`（`white` 不动以便重新检查换来的元素）；`white <= blue` 时循环，一趟把 0/1/2 分区到左中右。
- **复杂度**: 时间 O(n)，空间 O(1)
