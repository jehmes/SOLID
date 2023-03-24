package org.example.after;

import org.example.after.messageHandler.MessengerHandlerAfter;
import org.example.after.messages.EmailAfter;
import org.example.after.messages.SmsAfter;

public class AppAfter {
    public static void main(String[] args) throws Exception {
        MessengerHandlerAfter messenger = new MessengerHandlerAfter(new EmailAfter());
        messenger.sendToken();

        MessengerHandlerAfter messenger2 = new MessengerHandlerAfter(new SmsAfter());
        messenger2.sendToken();
    }
}
