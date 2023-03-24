package org.example.before;

import org.example.before.messageHandler.MessengerHandlerBefore;

public class AppBefore {
    public static void main(String[] args) throws Exception {
        MessengerHandlerBefore messenger = new MessengerHandlerBefore();
        messenger.setChanel("emailBefore");
        messenger.sendToken();

        MessengerHandlerBefore messenger2 = new MessengerHandlerBefore();
        messenger2.setChanel("smsBefore");
        messenger2.sendToken();
    }
}
