package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction() {
        String greeting = "Learning Java is a good time!";

        String part1 = greeting.substring(0, 5);
        String part2 = greeting.substring(7, 11);
        String part3 = "g " + greeting.substring(9);      

        String response = part1 + "\n" + part2 + "\n" + part3;

        return response;
    }

    public static void main(String[] args) {
        System.out.println(extraction());
    }
}
