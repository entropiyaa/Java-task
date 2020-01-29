package messenger.user;

import java.util.Objects;

public class User {

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
}