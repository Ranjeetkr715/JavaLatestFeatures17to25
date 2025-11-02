package com.java21.sequencecollection;

import java.util.ArrayList;
import java.util.List;

public class SequenceCollectionFeature {
    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        list.addFirst("First Element");
        list.addLast("Last Element");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.reversed());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
