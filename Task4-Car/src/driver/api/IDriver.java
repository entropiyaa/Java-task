package driver.api;

import garage.cars.api.ICar;
import garage.cars.api.LicenseCategory;
import garage.parts.key.api.IKey;

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
    void takePassenger();
}