package com.company;

import java.util.ArrayList;

public class ChatRoom implements IChatroom {
    private ArrayList<Participant> participants;

    public ChatRoom() {
        this.participants = new ArrayList<Participant>();
    }

    @Override
    public void register(Participant participant) {
        participants.add(participant);
    }

    @Override
    public void send(String text, Participant from) {
        participants.forEach(participant -> {
            if (from != participant) {
                participant.notify(text);
            }
        });
    }
}
