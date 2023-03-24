package org.example.after.messages;

public class SmsAfter implements IMessageAfter {
    @Override
    public void send() {
        System.out.println("SMS: Your token is 2342543");
    }
}
