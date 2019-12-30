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
                                          new Wheel(60, Seasonality.AllSeason, "K7"), new Lock(false));
        System.out.println(mercedes1.getEngine().getCapacity());

        Driver driver1 = new Driver(3, new Key(true), new ArrayList<LicenseCategory>(), mercedes1);
        System.out.println(driver1.getLicenseCategory());
        driver1.setLicenseCategory(LicenseCategory.A);
        System.out.println(driver1.getLicenseCategory());

        driver1.openCar(driver1.getKey());
        driver1.closeCar(driver1.getKey());
        driver1.startCar();
    }
}
