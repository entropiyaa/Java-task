package messenger.registration;

import messenger.user.User;
import messenger.validation.Validation;
import messenger.validation.ValidationException;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registration {

    private Map<String, User> UsersBase = new HashMap<>();

    public Map<String, User> getUsersBase()
    {
        return UsersBase;
    }

    public User registration(String login, String password) throws ValidationException {
        if(!UsersBase.containsKey(login))
        {
            Validation v = new Validation();
            if(v.validation(login, password))
            {
                Random random = new Random();
                long id = random.nextLong();
                User user = new User(id, login, password);
                UsersBase.put(login, user);
                return user;
            } else
            {
                throw new ValidationException("Не прошли валидацию");
            }
        } else {
            throw new ValidationException("Пользователь с таким логином уже есть");
        }
    }
}