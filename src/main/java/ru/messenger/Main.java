package ru.messenger;

public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4Users();
        Message[] messages = MessageService.create4Message(users[0], users[1]);
        usersOut(users);
        messagesOut(messages);
    }

    private static void usersOut(User[] users) {
        for (int i = 0; i < users.length; i++) {
            userOut(users[i]);
            System.out.println();
        }
    }

    private static void userOut(User user) {
        System.out.printf("%s, %s, %s, %s",user.getNickname(), user.getName(), user.getPhonenumber(), user.getPassword());
    }

    private static void messagesOut(Message[] mes) {
        for (int i = 0; i < mes.length; i++) {
            messageOut(mes[i]);
            System.out.println();
        }
    }

    private static void messageOut(Message mes) {
        System.out.printf("%s. %s to %s: %s",mes.getDateTime(), mes.getSender().getName(), mes.getRecipient().getName(), mes.getText());
    }
}
