package garage.parts.engine;

import garage.parts.engine.api.AEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IChangebleFuelType;

public class MercedesEngine extends AEngine implements IChangebleFuelType {

    public MercedesEngine(String id, int capacity, FuelType fuelType) {
        super(id, capacity, fuelType);
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
