package messenger.chat;

import messenger.message.Message;

import java.util.List;

public interface IChat extends ISaverChat {

    public void addMessage(Message message);
    public void addMessage(Message[] message);
    public void addMessage(List<Message> message);
}
