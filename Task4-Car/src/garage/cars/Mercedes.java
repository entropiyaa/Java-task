package garage.cars;

import garage.cars.api.ACars;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public class Mercedes extends ACars {
    private String model;

    public Mercedes(String model, IEngine engine, IWheel wheel, ILock lock)
    {
        super(model,4, LicenseCategory.B, engine, wheel, lock);
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }
}