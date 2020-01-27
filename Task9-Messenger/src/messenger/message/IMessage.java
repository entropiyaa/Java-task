package messenger.message;

import messenger.user.User;

import java.util.Date;

public interface IMessage<T> {
    User getUser();
    Enum getType();
    T getData();
    Date getDate();
}
