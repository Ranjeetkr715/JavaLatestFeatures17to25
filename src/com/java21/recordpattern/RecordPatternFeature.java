package com.java21.recordpattern;

public class RecordPatternFeature {

    public void recordPattern(Object obj){
        if(obj instanceof User(int userId,String userName)){
            System.out.println(STR."userId \{userId} userName \{userName}");
        }
    }
    public static void main(String [] args){
        RecordPatternFeature recordPatternFeature= new RecordPatternFeature();
        recordPatternFeature.recordPattern(new User(123,"Ranjeet"));
    }
}
