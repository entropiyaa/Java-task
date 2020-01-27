import messenger.chat.TextChat;
import messenger.message.Message;
import messenger.message.MessageType;
import messenger.registration.Registration;
import messenger.user.User;
import messenger.validation.ValidationException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ValidationException {

        Registration registration = new Registration();
        User user1 = registration.registration("masha@gmail.com", "jcjbgn/v");
        User user2 = registration.registration("tanya@mail.ru", "hsdhjc&?h");

        Message message1 = new Message<>(user1, MessageType.TEXT, "Hello!!", new Date());
        Message message2 = new Message<>(user2, MessageType.TEXT, "Hello, nice to meet you!!", new Date());

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);

        TextChat textChat = new TextChat(users, messages);

        for(Message mess : textChat.getMessages())
        {
            System.out.println(mess);
        }
    }
}