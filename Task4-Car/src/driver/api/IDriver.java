package driver.api;

import garage.cars.api.ICar;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.api.FuelType;
import garage.parts.key.api.IKey;
import garage.parts.wheel.api.Seasonality;

import java.util.ArrayList;

public interface IDriver {
    ICar getCar();
    int getDrivingExperience();
    IKey getKey();
    ArrayList<LicenseCategory> getLicenseCategory();
    void setLicenseCategory(LicenseCategory licenseCategory);
    void openCar(IKey key);
    void closeCar(IKey key);
    void startCar();
    void stopCar();
    void driveCar();
    void takePassenger(int countOfPassenger);
    void removePassenger(int countOfPassenger);
    void setFuelToTheCar(int newFuel, FuelType fuelType);
    void changeWheel(Seasonality s, int radius);
}
