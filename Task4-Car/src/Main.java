import driver.Driver;
import garage.cars.Mercedes;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.key.Key;
import garage.parts.lock.Lock;
import garage.parts.wheel.Wheel;
import garage.parts.wheel.api.Seasonality;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mercedes mercedes1 = new Mercedes("GL666", new MercedesEngine("A60", 2, FuelType.DIESEL),
                                          new Wheel(60, Seasonality.AllSeason, "K7"), new Lock("123"), 30);
        System.out.println(mercedes1.getEngine().getCapacity());

        Driver driver1 = new Driver(3, new Key("1123"), new ArrayList<LicenseCategory>(), mercedes1);
        System.out.println(driver1.getCar().getLock().isLock());
        driver1.setLicenseCategory(LicenseCategory.A);
        driver1.setLicenseCategory(LicenseCategory.B);

        driver1.openCar(driver1.getKey());
        System.out.println(driver1.getCar().getLock().isLock());
        driver1.startCar();
        for(int i = 0; i < 10; i++)
        {
            driver1.driveCar();
        }
        driver1.takePassenger(2);

       boolean a = driver1.checkLicence(driver1.getCar().getLicenseCategory());
       System.out.println(a);
    }
}
