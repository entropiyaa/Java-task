package messenger.saver;

import messenger.chat.IChat;
import messenger.message.IMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class BinarySaver implements ISaverChat {

    @Override
    public void save(IChat chat) {

        try(FileOutputStream stream = new FileOutputStream("chat.bin");
            ObjectOutputStream objectStream = new ObjectOutputStream(stream)) {
            List<IMessage> messages = chat.getMessages();
            for(IMessage message : messages)
            {
                objectStream.writeObject(message.getData());
            }
        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}