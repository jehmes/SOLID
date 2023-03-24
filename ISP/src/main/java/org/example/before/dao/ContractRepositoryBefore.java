package org.example.before.dao;

import org.example.before.logs.LogBefore;
import org.example.before.logs.NotificationBefore;
import org.example.before.interfaces.IRegister;

public class ContractRepositoryBefore extends BD implements IRegister {
    @Override
    public void save() {
        System.out.println("SAVING . . .");
    }

    @Override
    public void registerLog(LogBefore log) {
        //DONT NEED THIS METHOD
        System.out.println("DO NOTHING");
    }

    @Override
    public void sendNotification(NotificationBefore notification) {
        //DONT NEED THIS METHOD
        System.out.println("DO NOTHING");
    }
}
