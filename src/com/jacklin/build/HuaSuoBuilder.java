package com.jacklin.build;
// 具体华硕Builder
public class HuaSuoBuilder implements Builder {

    private Computer c;
    public HuaSuoBuilder(Computer c){
        this.c = c;
    }

    @Override
    public void buildMainBoard() {
        c.setMainBoard("华硕主板");
    }

    @Override
    public void buildCpu() {
        c.setCpu("华硕cpu");
    }

    @Override
    public void buildHD() {
        c.setHaskDisk("华硕硬盘");
    }

    @Override
    public Computer buildComputer() {
        return c;
    }
}
