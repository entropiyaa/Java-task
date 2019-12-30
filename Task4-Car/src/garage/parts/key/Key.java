package garage.parts.key;

import garage.parts.key.api.IKey;

public class Key implements IKey {

    private String key;

    public Key(String key)
    {
        this.key = key;
    }

/*    @Override
    public void useKey() {
        if(key)
        {
            System.out.println("Ключ подошёл!!");
        }
        else
        {
            System.out.println("Ключ не подходит");
        }
    }*/

    @Override
    public String getKey()
    {
        return key;
    }
}
