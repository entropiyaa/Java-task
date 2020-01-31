import messenger.Loader.LoaderUsers;
import messenger.chat.TextChat;
import messenger.message.IMessage;
import messenger.message.Message;
import messenger.message.MessageType;
import messenger.registration.Registration;
import messenger.saver.BinarySaver;
import messenger.saver.ConsoleSaver;
import messenger.saver.StandardSaver;
import messenger.saver.TextFileSaver;
import messenger.user.User;
import messenger.validation.ValidationException;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ValidationException, IOException {

        Registration registration = new Registration();
        User user1 = registration.registration("masha@gmail.com", "jcjbgn/v");
        User user2 = registration.registration("tanya@mail.ru", "hsdhjc&?h");

        IMessage message1 = new Message<>(user1, MessageType.TEXT, "Hello!!", new Date());
        IMessage message2 = new Message<>(user2, MessageType.TEXT, "Hello, nice to meet you!!", new Date());

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        List<IMessage> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);

        TextChat textChat = new TextChat(users, messages);

        textChat.save(new ConsoleSaver());
        textChat.save(new TextFileSaver());
        textChat.save(new StandardSaver());
        textChat.save(new BinarySaver());

        LoaderUsers loader = new LoaderUsers();
        loader.save(registration.getUsersBase());

        Map<String, User> newUsersBase = loader.load();
        loader.printUsers(newUsersBase);
    }
}