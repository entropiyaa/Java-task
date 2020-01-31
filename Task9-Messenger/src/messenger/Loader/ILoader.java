package messenger.Loader;

import messenger.user.User;

import java.util.Map;

public interface ILoader {
    void save(Map<String, User> usersBase);
    Map<String, User> load();
    String getPath();
}