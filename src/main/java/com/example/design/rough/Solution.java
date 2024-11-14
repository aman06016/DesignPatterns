package com.example.design.rough;

import java.util.Arrays;

public class Solution {
    static String s;
    static int n ;
    static String ans = "";
    static int [][] dp ;
    public  static String longestPalindrome(String a) {

        n = a.length();
        s = a;
        dp = new int[n][n];


        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        dfs(0, n-1);
        return ans;
    }

    public static int dfs(int i , int j){

        if(i <0 || j >= n || i>j){
            return 0;
        }
        if(dp[i][j]!= -1){
            return dp[i][j];
        }

        int len ;
        if(s.charAt(i) == s.charAt(j)){
            if(i<j)
                len = dfs(i+1, j-1)+2;
            else
                len = dfs(i+1, j-1)+1;
        }
        else{
            int x = dfs(i+1,j);
            int y = dfs(i,j-1);
            len = Math.max(x,y);
        }
        if(j-i+1 == len){
            if(len > ans.length()){
                ans = s.substring(i,j+1);
            }
        }

        return dp[i][j] =len;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
}

