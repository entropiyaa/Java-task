package messenger.message;

import messenger.user.User;

import java.util.Date;

public class Message<T> {

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

    public User getUser() {
        return user;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}