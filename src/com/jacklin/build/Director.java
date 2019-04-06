package com.jacklin.build;

// 构建者
public class Director {

    public static Computer constructorComputer(Builder builder){
        builder.buildHD();
        builder.buildCpu();
        builder.buildMainBoard();
        return builder.buildComputer();
    }
}
