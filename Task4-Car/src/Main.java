import driver.Driver;
import garage.cars.Mercedes;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.fuelTank.FuelTank;
import garage.parts.key.Key;
import garage.parts.lock.Lock;
import garage.parts.wheel.Wheel;
import garage.parts.wheel.api.Seasonality;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mercedes mercedes1 = new Mercedes("GL666", new MercedesEngine("A60", FuelType.DIESEL),
                                          new Wheel(60, Seasonality.AllSeason, "K7"), new Lock("123"),
                                           new FuelTank(30, FuelType.DIESEL));

        Driver driver1 = new Driver(3, new Key("123"), new ArrayList<LicenseCategory>(), mercedes1);
        driver1.setLicenseCategory(LicenseCategory.B);

        ArrayList<LicenseCategory> l = new ArrayList<>();
        l.add(LicenseCategory.B);

        Driver driver2 = new Driver(3, new Key("123"), l, mercedes1);

        driver1.openCar(driver1.getKey());
       // driver1.closeCar(driver2.getKey());
        driver1.startCar();
       // driver1.stopCar();
        driver1.setFuelToTheCar(30, FuelType.DIESEL);
        for(int i = 0; i < 10; i++)
        {
            driver1.driveCar();
        }
        driver1.setFuelToTheCar(30, FuelType.DIESEL);
        driver1.driveCar();

        driver1.takePassenger(2);
        driver1.removePassenger(2);

    }
}
