package com.xuanxiao.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "孙雨轩";

        switch (name){
            case "孙雨轩":
                System.out.println("孙雨轩");
                break;
            case "喧嚣":
                System.out.println("喧嚣");
                break;
            default:
                System.out.println("扯淡");
        }
    }
}
