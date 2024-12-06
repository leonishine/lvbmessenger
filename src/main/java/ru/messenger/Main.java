package ru.messenger;

import ru.messenger.User;
//import ru.messenger.UserService;
import ru.messenger.Message;
//import ru.messenger.MessageService;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        User[] users = {};
        Message[] messages = {};
        //User[] users = UserService.create4Users();
        //Message[] messages = MessageService.create4Messages(users[0], users[1]);
        usersOut(users);
        messagesOut(messages);
    }

    private static void usersOut(User[] users) {
        for (int i = 0; i < users.length; i++) {
            userOut(users[i]);
        }
    }

    private static void userOut(User user) {
        //System.out.printf("%s, %s, %d, %d",user.getNickname(), user.getName(), user.getPhonenumber(), user.getPassword());
    }

    private static void messagesOut(Message[] mes) {
        for (int i = 0; i < mes.length; i++) {
            messageOut(mes[i]);
        }
    }

    private static void messageOut(Message mes) {
        System.out.printf("%s. %s to %s: %s",mes.getDateTime(), mes.getSender().getClass().getName(), mes.getRecipient().getClass().getName(), mes.getText());
    }
}
