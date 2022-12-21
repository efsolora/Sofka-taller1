package org.example;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.seeType("canino");
        perro.setName("caltrate");
        String canino = perro.getName();
        System.out.println(canino);

    }
}