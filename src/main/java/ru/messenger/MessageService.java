package ru.messenger;

import java.util.Arrays;

public class MessageService {

    public MessageService() {}

    public MessageService(User user1, User user2) {
        create4Message(user1, user2);
    }

    public static Message[] create4Message(User user1, User user2) {
        Message[] arr = new Message[4];
        arr[0] = new Message(user1, user2, "Привет, ты как?", "06.12.2024 19:30");
        arr[1] = new Message(user2, user1, "Привет, отлично. Хочешь отсылку?", "06.12.2024 19:48");
        arr[2] = new Message(user1, user2, "Давай", "06.12.2024 19:50");
        arr[3] = new Message(user2, user1, "Прибыл Годжо Сатору", "06.12.2024 20:31");

        return arr;
    }
}
