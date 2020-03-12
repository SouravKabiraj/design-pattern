package com.company;

public class SwitchOffStatus extends State<Switch> {
    public SwitchOffStatus(String name) {
        super(name);
    }

    @Override
    public void handleChange(Switch s) {
        s.setState(new SwitchOnStatus("ON"));
    }
}
