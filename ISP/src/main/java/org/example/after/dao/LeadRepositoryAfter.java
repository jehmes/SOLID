package org.example.after.dao;

import org.example.after.interfaces.ILog;
import org.example.after.interfaces.INotification;
import org.example.after.interfaces.IRegisterAfter;
import org.example.after.logs.LogAfter;
import org.example.after.logs.NotificationAfter;

public class LeadRepositoryAfter extends BDAfter implements IRegisterAfter, INotification {
    @Override
    public void save() {
        System.out.println("SAVING . . .");
    }

    @Override
    public void sendNotification(NotificationAfter notification) {
        System.out.println("SEND NOTIFICATION . . .");
    }
}
