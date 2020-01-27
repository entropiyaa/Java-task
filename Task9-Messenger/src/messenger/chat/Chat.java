package messenger.chat;

import messenger.message.IMessage;
import messenger.message.Message;
import messenger.saver.ISaverChat;
import messenger.user.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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
        List<IMessage> arrayList = new ArrayList<>();
        arrayList.add(message);
        addMessage(arrayList);
    }

    @Override
    public void addMessage(IMessage[] message)
    {
        List<IMessage> arrayList = new ArrayList<>(Arrays.asList(message));
        addMessage(arrayList);
    }

    @Override
    public void addMessage(List<IMessage> message)
    {
        messages.addAll(message);
    }

    @Override
    public void save(ISaverChat saver) throws IOException {
        saver.save(this);
    }
}