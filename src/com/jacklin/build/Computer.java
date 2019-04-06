package com.jacklin.build;
// 产品
public class Computer {

    private String cpu;
    private String mainBoard;
    private String haskDisk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHaskDisk() {
        return haskDisk;
    }

    public void setHaskDisk(String haskDisk) {
        this.haskDisk = haskDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", haskDisk='" + haskDisk + '\'' +
                '}';
    }
}
