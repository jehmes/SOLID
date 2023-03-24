package org.example.before.interfaces;

import org.example.before.logs.LogBefore;
import org.example.before.logs.NotificationBefore;

public interface IRegister {
    void save();
    void registerLog(LogBefore log);
    void sendNotification(NotificationBefore notification);
}
