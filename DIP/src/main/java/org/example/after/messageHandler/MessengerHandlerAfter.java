package org.example.after.messageHandler;

import org.example.after.messages.IMessageAfter;

public class MessengerHandlerAfter {

    private final IMessageAfter messageAfter;

    public MessengerHandlerAfter(IMessageAfter messageAfter) {
        this.messageAfter = messageAfter;
    }

    public void sendToken() {
        messageAfter.send();
    }
}
