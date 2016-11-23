/**
*
* 引入辅助函数 boolean数组
* char to int
**/

public class Solution {
	    int len=s.length();
        int head=0,index=0,maxLen=0;
        boolean[] exist=new boolean[256];
	 for(boolean e : exist)
            e=false;
        while(index<len){
            if(exist[s.charAt(index)]){
                maxLen=Math.max(maxLen, index-head);
                while(s.charAt(head)!=s.charAt(index)){
                    exist[s.charAt(head)]=false;
                    head++;
                }
                head++; index++;
            }
            else{
                exist[s.charAt(index)]=true;
                index++;
            }
        }
}