package messenger.chat;

import messenger.message.Message;
import messenger.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public abstract class Chat implements IChat {

    private final Set<User> users;
    private final List<Message> messages;

    public Chat(Set<User> users, List<Message> messages)
    {
        this.users = users;
        this.messages = messages;
    }

    public Set<User> getUsers() {
        return users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public void addMessage(Message message)
    {
        List<Message> arrayList = new ArrayList<>();
        arrayList.add(message);
        addMessage(arrayList);
    }

    @Override
    public void addMessage(Message[] message)
    {
        List<Message> arrayList = new ArrayList<>(Arrays.asList(message));
        addMessage(arrayList);
    }

    @Override
    public void addMessage(List<Message> message)
    {
        messages.addAll(message);
    }

    @Override
    public void save(ISaverChat saver) {
        saver.save(this);
    }
}