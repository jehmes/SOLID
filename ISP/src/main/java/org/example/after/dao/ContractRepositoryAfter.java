package org.example.after.dao;

import org.example.after.interfaces.IRegisterAfter;
import org.example.after.logs.LogAfter;
import org.example.after.logs.NotificationAfter;
import org.example.before.interfaces.IRegister;

public class ContractRepositoryAfter extends BDAfter implements IRegisterAfter {
    @Override
    public void save() {
        System.out.println("SAVING . . .");
    }
}
