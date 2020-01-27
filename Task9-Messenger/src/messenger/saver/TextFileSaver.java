package messenger.saver;

import messenger.chat.IChat;
import messenger.message.IMessage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextFileSaver implements ISaverChat {

    @Override
    public void save(IChat chat) throws IOException
    {
        FileWriter fileWriter = new FileWriter("chat.txt");
        List<IMessage> messages = chat.getMessages();
        for(IMessage message : messages)
        {
            fileWriter.write(String.valueOf(message));
            fileWriter.append("\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }
}