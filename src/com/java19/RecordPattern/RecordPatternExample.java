package com.java19.RecordPattern;

public class RecordPatternExample {
    public static void main(String [] args){
        Object obj = new Count(4,5);

        if(obj instanceof Count(int x,int y)){
            System.out.println("X: " + x + ", Y: " + y);
        }

        //use inside switch

        String result = switch (obj){
            case Count(int x, int y) -> "Coordinate: " + x + " " + y;
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
