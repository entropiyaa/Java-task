package messenger.chat;

import messenger.message.IMessage;
import messenger.user.User;

import java.util.List;
import java.util.Set;

public class TextChat extends Chat {

    public TextChat(Set<User> users, List<IMessage> messages)
    {
        super(users, messages);
    }
}
