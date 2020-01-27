package messenger.saver;

import messenger.chat.IChat;
import messenger.message.IMessage;

import java.util.List;

public class ConsoleSaver implements ISaverChat {

    @Override
    public void save(IChat chat)
    {
        List<IMessage> messages = chat.getMessages();
        for(IMessage message : messages)
        {
            System.out.println(message);
        }
    }
}
