package garage.parts.fuelTank.api;

import garage.parts.engine.api.FuelType;

public interface IFuelTank {
    int getCapacityOfTank();
    int getFuelCount();
    FuelType getFuelType();
    void setFuel(int newFuel, FuelType fuelType);
    void useFuel(int usefulFuel);
}
