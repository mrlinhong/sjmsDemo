package com.jacklin.build;
// 抽象生产
public interface Builder {

    // 构建主板
    public void buildMainBoard();

    // 构建cpu
    public void buildCpu();

    // 构建硬盘
    public void buildHD();

    // 构建最终生产的电脑
    public Computer buildComputer();
}
