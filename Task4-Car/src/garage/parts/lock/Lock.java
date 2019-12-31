package garage.parts.lock;

import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;

public class Lock implements ILock {

    private final String lock;
    private boolean lockCondition;

    public Lock(String lock)
    {
        this.lock = lock;
    }

    @Override
    public void openLock() {
        System.out.println("Водитель открыл машину");
        lockCondition = true;
    }

    @Override
    public void closeLock() {
        System.out.println("Водитель закрыл машину");
        lockCondition = false;
    }

    @Override
    public String getLock() {
        return lock;
    }

    @Override
    public boolean isLock() {
        return lockCondition;
    }

    @Override
    public boolean checkKey(IKey key) {
        return lock.equals(key.getKey());
    }
}
