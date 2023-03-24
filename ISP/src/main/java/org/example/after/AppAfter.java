package org.example.after;


import org.example.after.dao.ContractRepositoryAfter;
import org.example.after.dao.LeadRepositoryAfter;
import org.example.after.dao.UserRepositoryAfter;
import org.example.after.logs.LogAfter;
import org.example.after.logs.NotificationAfter;

public class AppAfter {
    public static void main(String[] args) {
        ContractRepositoryAfter contractRepository = new ContractRepositoryAfter();
        contractRepository.save();

        System.out.println();

        LeadRepositoryAfter leadRepository = new LeadRepositoryAfter();
        leadRepository.save();
        leadRepository.sendNotification(new NotificationAfter());

        System.out.println();

        UserRepositoryAfter userRepository = new UserRepositoryAfter();
        userRepository.save();
        userRepository.registerLog(new LogAfter());
        userRepository.sendNotification(new NotificationAfter());
    }
}
