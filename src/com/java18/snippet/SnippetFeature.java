package com.java18.snippet;

/**
 * This method adds two numbers.
 *
 * @snippet :
 * {
 * int sum = add(3, 5);
 * System.out.println(sum); // 8
 * }
 */
public class SnippetFeature {
    public int add(int a, int b) {
        return a + b;
    }
       public static void main(String [] args){
        SnippetFeature snippetFeature= new SnippetFeature();
        System.out.println(snippetFeature.add(3,5));
       }
}
