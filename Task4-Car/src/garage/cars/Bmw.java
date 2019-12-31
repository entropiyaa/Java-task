package garage.cars;

import garage.cars.api.ACars;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.api.IEngine;
import garage.parts.fuelTank.api.IFuelTank;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public class Bmw extends ACars {

    public Bmw(String model, IEngine engine, IWheel wheel, ILock lock, IFuelTank fuelTank)
    {
        super(model,5, LicenseCategory.B, engine, wheel, lock, fuelTank);
    }

    @Override
    public String getBrand() {
        return "Bmw";
    }
}
