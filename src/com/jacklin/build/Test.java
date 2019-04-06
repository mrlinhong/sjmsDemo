package com.jacklin.build;

public class Test {
    public static void main(String[] args) {
        Computer computer = Director.constructorComputer(new HuaSuoBuilder(new Computer()));
        System.out.println(computer);

        Computer computer1 = Director.constructorComputer(new HuaWeiBuilder(new Computer()));
        System.out.println(computer1);
    }
}
