package com.java21.stringtemplate;

import static java.lang.StringTemplate.STR;

public class StringTemplateFeature {
    public static void main(String [] args){
        var a = 49;
        var name = "Ranjeet";
        System.out.println(STR."value of a is \{a}");
        System.out.println(STR."value of a is \{name}");
        System.out.println(STR."value of a is \{a} and name is \{name}");
    }
}
