package messenger.saver;

import messenger.chat.IChat;

import java.io.IOException;

public interface ISaverChat {
    void save(IChat chat) throws IOException;
}
