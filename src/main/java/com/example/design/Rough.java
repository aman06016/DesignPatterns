package com.example.design;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Rough {
    public static void main(String[] args) {

        HashMap<String,String> hash = new HashMap<>();
        LinkedHashMap<String,String> link = new LinkedHashMap<>();

        for(int i = 1; i< 20 ;i++){
            hash.put("key"+i , "value"+i);
            link.put("key"+i , "value"+i);
        }


        System.out.println("printing hash map");

        for(String key : hash.keySet()){
            System.out.println(key + " -> " + hash.get(key));
        }
        System.out.println("printing linked map");

        for(String key : link.keySet()){
            System.out.println(key + " -> " + link.get(key));
        }

    }
}
