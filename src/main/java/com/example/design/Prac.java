package com.example.design;

import java.util.HashMap;
import java.util.Map;

class Solution {
    static int n,m;
    static Map<String,Integer> checked = new HashMap<>();
    static Map<String,Integer> distance ;
    static char[][] a ;
    static int got = -1;

    public static boolean containsCycle(char[][] grid) {

        n = grid.length;
        m = grid[0].length;
        a = grid;

        for(int i = 0; i<n ;i++){
            for(int j =0;j<m;j++){

                if (checked.getOrDefault(i+","+j,0)==0){

                    distance = new HashMap<>();
                    dfs(grid[i][j] , i , j ,0);
                    if(got == 1){
                        return true;
                    }

                }
            }
        }

        return false;

    }

    public static void dfs(char ch, int i , int j,int dist){

        if(got == 1){
            return;
        }
        if(i<0 || i >= n || j<0 || j>= m || a[i][j] != ch){
            return;
        }
        String key = i+","+j;

        if(distance.containsKey(key)){
            if(dist-distance.getOrDefault(key,0) > 4){
                got =1 ;
            }
            return;
        }

        distance.put(key,dist);
        checked.put(key,1);
        dfs(ch,i+1,j,dist+1);
        dfs(ch,i-1,j,dist+1);
        dfs(ch, i,j+1,dist+1);
        dfs(ch, i , j-1,dist+1);

        distance.remove(key);

    }

    public static void main(String[] args) {
        char[][] charArray = {
                {'f', 'a', 'a', 'c', 'b'},
                {'e', 'a', 'a', 'e', 'c'},
                {'c', 'f', 'b', 'b', 'b'},
                {'c', 'e', 'a', 'b', 'e'},
                {'f', 'e', 'f', 'b', 'f'}
        };
        containsCycle(charArray);
    }
}