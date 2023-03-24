package org.example.before.messages;

public class SmsBefore implements IMessageBefore{
    @Override
    public void send() {
        System.out.println("SMS: Your token is 2342543");
    }
}
