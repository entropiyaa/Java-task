package garage.parts.lock;

import garage.parts.lock.api.ILock;

public class Lock implements ILock {

    private boolean lock;

    public Lock(boolean lock)
    {
        this.lock = lock;
    }

    @Override
    public void openLock() {
        if(!lock)
        {
            lock = true;
            System.out.println("Замок открылся");
        }
        else
        {
            System.out.println("Замок и так открыт, хватит поворачивать ключ!!");
        }
    }

    @Override
    public void closeLock() {
        if(lock)
        {
            lock = false;
            System.out.println("Закрыли замок");
        }
        else
        {
            System.out.println("Замок и так закрыт, хватит поворачивать ключ!!");
        }
    }

    @Override
    public boolean isLock() {
        return lock;
    }
}
