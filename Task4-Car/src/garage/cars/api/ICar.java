package garage.cars.api;

import garage.parts.engine.api.FuelType;
import garage.parts.fuelTank.api.IFuelTank;
import garage.parts.key.api.IKey;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;
import garage.parts.wheel.api.Seasonality;

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
    IFuelTank getFuelTank();
    void setFuel(int newFuel, FuelType fuelType);
    void changeWheel(Seasonality s, int radius);
    void driverSeatTake();
    void driverSeatLeave();
    void passengerSeatTake(int countOfPassenger);
    void passengerSeatLeave(int countOfPassenger);
}
