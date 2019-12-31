package garage.parts.fuelTank;

import garage.parts.engine.api.FuelType;
import garage.parts.fuelTank.api.IFuelTank;

public class FuelTank implements IFuelTank {

    private final int capacityOfTank;
    private int fuelCount;
    private FuelType fuelType;

    public FuelTank(int capacityOfTank, FuelType fuelType)
    {
        this.capacityOfTank = capacityOfTank;
        this.fuelType = fuelType;
    }

    @Override
    public int getCapacityOfTank() {
        return capacityOfTank;
    }

    @Override
    public int getFuelCount() {
        return fuelCount;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuel(int newFuel, FuelType fuelType) {
        if (fuelCount + newFuel <= capacityOfTank)
        {
            fuelCount += newFuel;
            System.out.println("Заправили машину");
        }
        else
        {
            System.out.println("Вы хотите залить слишком много топлива, не позволяет вместительность");
        }
    }

    @Override
    public void useFuel(int usefulFuel) {
        fuelCount -= usefulFuel;
    }
}
