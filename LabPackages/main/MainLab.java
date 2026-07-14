package main;

import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();
        System.out.println(one.greet());
        System.out.println(two.greet());
        System.out.println(three.greet());
    }
}