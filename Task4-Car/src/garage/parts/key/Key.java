package garage.parts.key;

import garage.parts.key.api.IKey;

public class Key implements IKey {

    private String key;

    public Key(String key)
    {
        this.key = key;
    }

    @Override
    public String getKey()
    {
        return key;
    }
}
