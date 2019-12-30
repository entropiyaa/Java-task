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
    void close();
    void start();
    void stop();
    void fuel();
    void changeWheel();
    void driverSeat();
    void passengerSeat();
}
