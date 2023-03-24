package org.example.before;

import org.example.before.messageHandler.MessengerBefore;

public class AppBefore {
    public static void main(String[] args) throws Exception {
        MessengerBefore messenger = new MessengerBefore();
        messenger.setChanel("emailBefore");
        messenger.sendToken();

        MessengerBefore messenger2 = new MessengerBefore();
        messenger2.setChanel("smsBefore");
        messenger2.sendToken();
    }
}
