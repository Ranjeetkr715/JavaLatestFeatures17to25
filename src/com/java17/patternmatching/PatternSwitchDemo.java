package com.java17.patternmatching;

/*Pattern Matching for switch (Preview in Java 17)
Purpose:
Simplifies complex switch statements and supports type patterns directly.
The switch now supports type patterns (case String s, etc.).
Reduces boilerplate and makes code more expressive.*/

public class PatternSwitchDemo {
    public String formatMatter(Object object){
        return switch (object){
            case Integer i -> "Integer " + i;
            case String s -> "String " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };
    }
    public static void main(String [] args){
        PatternSwitchDemo patternSwitchDemo= new PatternSwitchDemo();
        System.out.println(patternSwitchDemo.formatMatter(123));
        System.out.println(patternSwitchDemo.formatMatter("Ranjeet"));
    }
}
