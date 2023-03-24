package org.example.before;

import org.example.before.dao.ContractRepositoryBefore;
import org.example.before.dao.LeadRepositoryBefore;
import org.example.before.dao.UserRepositoryBefore;
import org.example.before.logs.LogBefore;
import org.example.before.logs.NotificationBefore;

public class AppBefore {
    public static void main(String[] args) {
        ContractRepositoryBefore contractRepository = new ContractRepositoryBefore();
        contractRepository.save();
        contractRepository.registerLog(new LogBefore());
        contractRepository.sendNotification(new NotificationBefore());

        System.out.println();

        LeadRepositoryBefore leadRepository = new LeadRepositoryBefore();
        leadRepository.save();
        leadRepository.registerLog(new LogBefore());
        leadRepository.sendNotification(new NotificationBefore());

        System.out.println();

        UserRepositoryBefore userRepository = new UserRepositoryBefore();
        userRepository.save();
        userRepository.registerLog(new LogBefore());
        userRepository.sendNotification(new NotificationBefore());
    }
}
