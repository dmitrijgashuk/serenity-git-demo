package com.epam.dmytro_hashuk;

public class StringProvider {
    private final String greetings = "Hello ";
    private final String name = "World";
    private final String separator = "_";

    public void getGreetings(){
        System.out.println(String.format("%s_%s !", greetings, name));
    }
}
