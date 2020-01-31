package messenger.Loader;

public abstract class ALoader implements ILoader {

    private String path;

    ALoader(String path)
    {
        this.path = path;
    }

    @Override
    public String getPath()
    {
        return path;
    }
}