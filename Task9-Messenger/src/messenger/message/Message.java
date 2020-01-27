package messenger.message;

import messenger.user.User;

import java.util.Date;

public class Message<T> implements IMessage {

    private final User user;
    private Enum type;
    private T data;
    private Date date;

    public Message(User user, Enum type, T data, Date date)
    {
        this.user = user;
        this.type = type;
        this.data = data;
        this.date = date;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Enum getType() {
        return type;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}