package org.example.before.messages;

public class EmailBefore implements IMessageBefore{
    @Override
    public void send() {
        System.out.println("Email: Your token is 6426428");
    }
}
