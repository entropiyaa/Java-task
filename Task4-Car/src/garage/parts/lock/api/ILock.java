package garage.parts.lock.api;

import garage.parts.key.api.IKey;

public interface ILock {
    void openLock();
    void closeLock();
    String getLock();
    boolean isLock();
    boolean checkKey(IKey key);
}
