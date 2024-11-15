package com.example.design.lldPatterns.creational.factoryPattern.example1.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList();

    public void prepare(){
        System.out.println("preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce");
        System.out.println("adding toppings ... ");

        for(String x: toppings){
            System.out.println(" " + x);
        }
    }

    public void bake(){
        System.out.println("bake for 24 min");
    }

    public void cut(){
        System.out.println("give diagonal cut");
    }
    public void box(){
        System.out.println("pack in square box");
    }

    public String getName(){
        return name;
    }
}
