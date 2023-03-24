package org.example.before.dao;

import org.example.before.logs.LogBefore;
import org.example.before.logs.NotificationBefore;
import org.example.before.interfaces.IRegister;

public class UserRepositoryBefore extends BD implements IRegister {
    @Override
    public void save() {
        System.out.println("SAVING . . .");
    }

    @Override
    public void registerLog(LogBefore log) {
        System.out.println("REGISTERING . . .");
    }

    @Override
    public void sendNotification(NotificationBefore notification) {
        System.out.println("SEND NOTIFICATION . . .");
    }
}
