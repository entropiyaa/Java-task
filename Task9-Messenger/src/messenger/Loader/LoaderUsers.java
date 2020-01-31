package messenger.Loader;

import messenger.user.User;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoaderUsers extends ALoader {

    public LoaderUsers()
    {
        super("users.bin");
    }

    @Override
    public void save(Map<String, User> usersBase)
    {
        try(FileOutputStream fos = new FileOutputStream(this.getPath());
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Map.Entry<String, User> entry : usersBase.entrySet())
            {
                User user = entry.getValue();
                oos.writeObject(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Map<String, User> load() {
        Map<String, User> usersBase = new HashMap<>();
        try(FileInputStream fis = new FileInputStream(this.getPath());
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            while(fis.available() > 0)
            {
                User newUser = (User)ois.readObject();
                usersBase.put(newUser.getName(), newUser);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return usersBase;
    }

    public void printUsers(Map<String, User> usersBase)
    {
        for(Map.Entry<String, User> entry : usersBase.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
}