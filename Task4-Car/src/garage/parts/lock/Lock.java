package garage.parts.lock;

import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;

public class Lock implements ILock {

    private String lock;
    private boolean lockCondition;

    public Lock(String lock)
    {
        this.lock = lock;
    }

    @Override
    public void openLock() {
        lockCondition = true;
    }

    @Override
    public void closeLock() {
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
