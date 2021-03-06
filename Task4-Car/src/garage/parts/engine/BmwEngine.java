package garage.parts.engine;

import garage.parts.engine.api.AEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IChangebleFuelType;

public class BmwEngine extends AEngine implements IChangebleFuelType {

    public BmwEngine(String id, FuelType fuelType) {
        super(id, fuelType);
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
