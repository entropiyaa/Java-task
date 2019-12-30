package garage.cars;

import garage.cars.api.ACars;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public class Audi extends ACars {

    public Audi(String model, IEngine engine, IWheel wheel, ILock lock)
    {
        super(model,5, LicenseCategory.B, engine, wheel, lock);
    }

    @Override
    public String getBrand() {
        return null;
    }
}