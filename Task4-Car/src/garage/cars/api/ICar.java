package garage.cars.api;

import garage.parts.key.api.IKey;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public interface ICar {
    String getModel();
    String getBrand();
    int getNumberOfSeats();
    LicenseCategory getLicenseCategory();
    IEngine getEngine();
    IWheel getWheel();
    ILock getLock();
    void drive();
    void open(IKey key);
    void close(IKey key);
    void start();
    void stop();
    int getFuel();
    void setFuel(int newFuel);
    void useFuel(int usefulFuel);
    void changeWheel();
    void driverSeat();
    void passengerSeat(int countOfPassenger);
}
