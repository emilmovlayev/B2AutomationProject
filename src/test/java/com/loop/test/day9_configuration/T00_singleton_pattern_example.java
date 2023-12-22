package com.loop.test.day9_configuration;

public class T00_singleton_pattern_example {

    private T00_singleton_pattern_example(){}

    private static String word;

    public static String getWord(){
        if (word==null) {
            System.out.println("first time calling object is null and assigning now");
            word="driver";
        }else{
            System.out.println("word is already assigned and has value");
        }
        return word;
    }
}
