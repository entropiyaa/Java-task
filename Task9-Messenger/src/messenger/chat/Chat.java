package messenger.chat;

import messenger.message.IMessage;
import messenger.saver.ISaverChat;
import messenger.user.User;

import java.io.IOException;
import java.util.*;

public abstract class Chat implements IChat {

    private final Set<User> users;
    private final List<IMessage> messages;

    public Chat(Set<User> users, List<IMessage> messages)
    {
        this.users = users;
        this.messages = messages;
    }

    @Override
    public Set<User> getUsers() {
        return users;
    }

    @Override
    public List<IMessage> getMessages()
    {
        return messages;
    }

    @Override
    public void addMessage(IMessage message)
    {
        if(users.contains(message.getUser()))
        {
            messages.add(message);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addMessage(IMessage[] message)
    {
        if(message != null)
        {
            for(IMessage mes : message)
            {
                addMessage(mes);
            }
        }
    }

    @Override
    public void addMessage(List<IMessage> message)
    {
        if(message != null)
        {
            for(IMessage mes : message)
            {
                addMessage(mes);
            }
        }
    }

    @Override
    public void save(ISaverChat saver) throws IOException {
        saver.save(this);
    }
}