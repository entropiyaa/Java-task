package messenger.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public boolean validation(String login, String password) throws ValidationException
    {
        return validationLogin(login) && validationPassword(password);
    }

    public boolean validationLogin(String login) throws ValidationException
    {
        if(login.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.]+\\.[a-z]+"))
        {
            return true;
        } else
        {
            throw new ValidationException("Неправильно введён логин");
        }
    }

    public boolean validationPassword(String password) throws ValidationException
    {
        Pattern pattern = Pattern.compile("(?=.*[':/!?+%]).{7,}");
        Matcher m = pattern.matcher(password);
        if(m.find())
        {
            pattern = Pattern.compile("(.)\\1");
            m = pattern.matcher(password);
            if(!m.find())
            {
                return true;
            }
            else
            {
                throw new ValidationException("В вашем пароле два одинаковых символа подряд");
            }
        }
        else
        {
            throw new ValidationException("В вашем пароле менне 7 символов или не хватает спецсимвола");
        }
    }
}