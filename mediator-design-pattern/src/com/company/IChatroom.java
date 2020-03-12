package com.company;

public interface IChatroom {
    void register(Participant participant);

    void send(String text, Participant from);
}
