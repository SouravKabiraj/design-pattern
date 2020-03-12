package com.company;

public class SwitchOnStatus extends State<Switch> {
    public SwitchOnStatus(String name) {
        super(name);
    }

    @Override
    public void handleChange(Switch s) {
        s.setState(new SwitchOffStatus("OFF"));
    }
}
