package com.jacklin.build;
// 具体华为Builder
public class HuaWeiBuilder implements Builder {
    private Computer c;

    public HuaWeiBuilder(Computer c) {
        this.c = c;
    }

    @Override
    public void buildMainBoard() {
        c.setMainBoard("华为主板");
    }

    @Override
    public void buildCpu() {
        c.setCpu("华为cpu");
    }

    @Override
    public void buildHD() {
        c.setHaskDisk("华为硬盘");
    }

    @Override
    public Computer buildComputer() {
        return c;
    }
}
