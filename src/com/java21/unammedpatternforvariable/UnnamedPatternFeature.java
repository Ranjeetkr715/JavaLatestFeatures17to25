package com.java21.unammedpatternforvariable;

public class UnnamedPatternFeature {
    public static void main(String [] args){
        try{
            int a =100;
            System.out.println(a/0);
        } catch (RuntimeException e) {
            System.out.println("Error");
        }

        // Unnamed Pattern and variables - > java 21 feature
        try{
            int a =200;
            System.out.println(a/0);
        } catch (RuntimeException _) {   // replace by Variable to underscore
            System.out.println("Error");
        }
    }
}
