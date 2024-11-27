package com.example.design;

class Solution {
    static int ans = 0;

    public static int getMoneyAmount(int n) {

        if(n == 1){
            return 0;
        }
        dfs(0,n);
        return ans;
    }

    public static void dfs(int i , int j ){

        if(i+1==j || i ==j){
            return;
        }

        int s1 = (j * (j+1))/2;
        int s2 = (i * (i+1))/2;
        int ss = (int) Math.ceil((s2 - s1)/2);
        int m = -1;
        int summ = 0;
        for(int k = i;k<=j ;k++){

            summ += k;
            if(summ >= ss){
                m = k;
                break;
            }
        }
        ans += m;

        dfs(m,j);
    }

    public static void main(String[] args) {
        System.out.println(getMoneyAmount(10));
    }
}