package com.javabasics;

public class UIControl {
    private boolean isEnable = true;

//    public UIControl(boolean isEnable) {
//        this.isEnable = isEnable;
//        System.out.println("UI control");
//
//    }

    public void render(){

    }

    public void enable(){
        isEnable = true;
    }

    public void disable(){
        isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }


}
