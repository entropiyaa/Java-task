package messenger.user;

import messenger.registration.Registration;
import messenger.validation.Validation;
import messenger.validation.ValidationException;

import java.io.*;
import java.util.Objects;

public class User implements Serializable {

    static final long SerialVersionUID = 1L;

    private final long id;
    private String login;
    private String password;

    public User(long id, String login, String password)
    {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public long getId()
    {
        return id;
    }

    public String getLogin()
    {
        return login;
    }

    public void changeLogin(String login, Registration registration)
    {
        if(registration.getUsersBase().containsKey(login))
        {
            System.out.println("Логин " + login + " уже существует");
            System.out.println("Новый логин у " + this.getLogin() + " не установлен");
        } else {
            try {
                if(new Validation().validationLogin(login))
                {
                    System.out.print("Логин у пользователя " + this.getLogin());
                    this.login = login;
                    System.out.println(" успешно изменён на " + this.getLogin());
                }
            } catch(ValidationException e)
            {
                e.printStackTrace();
                System.out.println("Новый логин у " + this.getLogin() + " не установлен");
            }
        }
    }

    public String getPassword()
    {
        return password;
    }

    public void changePassword(String password) {
        try {
            if(new Validation().validationPassword(password))
            {
                this.password = password;
                System.out.println("Новый пароль у " + this.getLogin() +" установлен");
            }
        } catch(ValidationException e)
        {
            e.printStackTrace();
            System.out.println("Новый пароль у " + this.getLogin() + " не установлен");
        }
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
                ", name='" + login + '\'' +
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