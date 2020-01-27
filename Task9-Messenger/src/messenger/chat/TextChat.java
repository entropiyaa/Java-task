package messenger.chat;

import messenger.message.Message;
import messenger.user.User;

import java.util.List;
import java.util.Set;

public class TextChat extends Chat {
    @Override
    public void save(ISaverChat sever) {
        super.save(sever);
    }

    public TextChat(Set<User> users, List<Message> messages) {
        super(users, messages);
    }
}
