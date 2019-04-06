package com.jacklin.adapter;
// 类适配器 适配器模式的核心
public class ClassFormatMovice extends PlayMP4 implements PlayMovie{

    @Override
    public void playMovie() {
        super.playMP4Movie();
    }
}
