package messenger.saver;

import messenger.chat.IChat;
import messenger.message.IMessage;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StandardSaver implements ISaverChat {

    @Override
    public void save(IChat chat) {
        try(FileWriter fileWriter = new FileWriter("TextChat.txt")) {
            List<IMessage> messages = chat.getMessages();
            for(IMessage message : messages)
            {
                fileWriter.write(message.toString());
                fileWriter.append("\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}