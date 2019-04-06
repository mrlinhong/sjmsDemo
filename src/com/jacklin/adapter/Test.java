package com.jacklin.adapter;

public class Test {
    public static void main(String[] args) {
        PlayMovie m = new ClassFormatMovice();
        m.playMovie();

        PlayMovie m1 = new ObjectFormatMovice();
        m1.playMovie();
    }
}
