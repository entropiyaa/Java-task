package messenger.chat;

import messenger.message.IMessage;
import messenger.saver.ISaverChat;
import messenger.user.User;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface IChat {

    Set<User> getUsers();
    List<IMessage> getMessages();
    void addMessage(IMessage message);
    void addMessage(IMessage[] message);
    void addMessage(List<IMessage> message);
    void save(ISaverChat saver) throws IOException;
}
