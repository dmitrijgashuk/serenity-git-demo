package com.epam.dmytro_hashuk;
public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("_");
        builder.append("World");
        builder.append("!");

        String result = builder.toString();
        System.out.println(result);
    }
}