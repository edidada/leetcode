给定一个有n个数字的数组S，在S中是否存在元素a，b，c和d的和恰好满足a + b + c + d = target。

找出数组中所有的不想等的这四个元素，其和等于target。

备注：

在（a，b，c，d）中的元素必须从小到大排列。（a ≤ b ≤ c ≤ d）
其结果必须不能够重复。

例如，给定S = {1 0 -1 0 -2 2}，target = 0。
一个结果集为：
(-1,  0, 0, 1)
(-2, -1, 1, 2)
(-2,  0, 0, 2)

Given an array S of n integers, 
are there elements a, b, c, and d in S such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.

For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

A solution set is:
(-1,  0, 0, 1)
(-2, -1, 1, 2)
(-2,  0, 0, 2)