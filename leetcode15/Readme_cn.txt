LeetCode 15 3Sum（3个数的和） 
版权声明：本文为 nomasp柯于旺 原创，未经许可严禁转载！欢迎访问我的博客：http://blog.csdn.net/nomasp


翻译
给定一个有n个整数的数组S，是否存在三个元素a,b,c使得a+b+c=0?
找出该数组中所有不重复的3个数，它们的和为0。

备注：
这三个元素必须是从小到大进行排序。
结果中不能有重复的3个数。

例如，给定数组S={-1 0 1 2 -1 4}，一个结果集为：
(-1, 0, 1)
(-1, -1, 2)


Given an array S of n integers, 
are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. 
(ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.

For example, given array S = {-1 0 1 2 -1 -4},
A solution set is:

(-1, 0, 1)
(-1, -1, 2)