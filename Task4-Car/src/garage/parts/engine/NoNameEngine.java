package garage.parts.engine;

import garage.parts.engine.api.AEngine;
import garage.parts.engine.api.FuelType;

public class NoNameEngine extends AEngine {

    public NoNameEngine(String id, int capacity, FuelType fuelType) {
        super(id, capacity, fuelType);
    }
}
