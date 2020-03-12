package com.company;

public class Main {

    public static void main(String[] args) {
        Participant A = new Participant("A");
        Participant B = new Participant("B");
        Participant C = new Participant("C");
        Participant D = new Participant("D");
        Participant E = new Participant("E");

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.register(A);
        chatRoom.register(B);
        chatRoom.register(C);
        chatRoom.register(D);
        chatRoom.register(E);

        chatRoom.send("This text from A", A);
        chatRoom.send("This text from C", C);

    }
}
