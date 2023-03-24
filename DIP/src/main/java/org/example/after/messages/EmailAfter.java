package org.example.after.messages;

public class EmailAfter implements IMessageAfter {
    @Override
    public void send() {
        System.out.println("Email: Your token is 6426428");
    }
}
