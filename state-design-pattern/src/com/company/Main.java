package com.company;

public class Main {

    public static void main(String[] args) {
        SwitchOffStatus off = new SwitchOffStatus("OFF");
        Switch swtch = new Switch(off);
        swtch.click();
        System.out.println(swtch.getState());
        swtch.click();
        System.out.println(swtch.getState());
        swtch.click();
        System.out.println(swtch.getState());
        swtch.click();
        System.out.println(swtch.getState());
        swtch.click();
        System.out.println(swtch.getState());
        swtch.click();
        System.out.println(swtch.getState());
    }
}
