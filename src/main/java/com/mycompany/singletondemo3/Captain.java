package com.mycompany.singletondemo3;

public class Captain {
    private static final Captain captain = new Captain();
    
    private Captain(){
        System.out.println("\nNew captain is elected to your team.");
    }
    
    public static Captain getCaptain(){
        System.out.println("\tYou already have a captain to your team.");
        System.out.println("\tSend him to toss the coin.");
        return captain;
    }
    
    // This method is used to demonstrate that a new instance is created
    // as soon as the Capitain class is loaded into memory.
    public static void dummyMethod(){
        System.out.println("It is a dummy method!");
    }
}
