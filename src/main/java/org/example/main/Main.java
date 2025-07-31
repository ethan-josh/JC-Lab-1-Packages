package org.example.main;
import java.lang.System.*;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ClassOne classone = new ClassOne();
        ClassTwo classtwo = new ClassTwo();
        ClassThree classthree = new ClassThree();

        out.println(classone.greet());
        out.println(classtwo.greet());
        out.println(classthree.greet());

    }
}