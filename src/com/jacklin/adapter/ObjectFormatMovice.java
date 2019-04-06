package com.jacklin.adapter;
// 对象适配器 组合
public class ObjectFormatMovice implements PlayMovie{

    private PlayMP4 playMP4 = new PlayMP4();

    @Override
    public void playMovie() {
        playMP4.playMP4Movie();
    }
}
