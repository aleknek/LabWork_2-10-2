package com.brainacad.oop.testwrapper2;

public class Main {

    public static void main(String[] args) {

        Byte b = 10;
        Integer i = 50;

        assert compute(b, i) == 0;

        System.out.println(compute(b, i));
    }

    public static Long compute(Byte x, Integer y) {

        Long z = Long.valueOf(x + y);
        return z;

    }

}
