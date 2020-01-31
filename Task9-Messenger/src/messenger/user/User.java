package messenger.user;

import java.io.*;
import java.util.Objects;

public class User implements Serializable {

    static final long SerialVersionUID = 1L;

    private long id;
    private String name;
    private String password;

    public User(long id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void changeName(String name)
    {
        this.name = name;
        // TODO добавить проверку
    }

    public String getPassword()
    {
        return password;
    }

    public void changePassword(String password)
    {
        this.password = password;
        // TODO добавить проверку
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
    }

    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("Stream data required");
    }
}