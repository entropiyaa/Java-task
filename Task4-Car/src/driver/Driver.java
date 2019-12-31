package driver;

import driver.api.IDriver;
import garage.cars.api.ICar;
import garage.cars.api.LicenseCategory;
import garage.parts.engine.api.FuelType;
import garage.parts.key.api.IKey;

import java.util.ArrayList;

public class Driver implements IDriver {

    private int drivingExperience;
    private IKey key;
    private ArrayList<LicenseCategory> driverLicense;
    private ICar car;

    public Driver(int drivingExperience, IKey key, ArrayList<LicenseCategory> driverLicense, ICar car)
    {
        this.drivingExperience = drivingExperience;
        this.key = key;
        this.driverLicense = driverLicense;
        this.car = car;
    }

    @Override
    public ICar getCar() {
        return car;
    }

    @Override
    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public IKey getKey() {
        return key;
    }

    @Override
    public ArrayList<LicenseCategory> getLicenseCategory() {
        return driverLicense;
    }

    @Override
    public void setLicenseCategory(LicenseCategory licenseCategory) {
        driverLicense.add(licenseCategory);
    }

    @Override
    public void openCar(IKey key) {
        if(this.getCar().getLock().isLock()) {
            System.out.println("Водитель не может открыть ключом уже открытую машину!!");
        } else {
            this.getCar().open(key);
        }
    }

    @Override
    public void closeCar(IKey key) {
        if(!this.getCar().getLock().isLock()) {
            System.out.println("Водитель не может закрыть ключом уже закрытую машину!!");
        } else {
            this.getCar().close(key);
        }
    }

    @Override
    public void startCar() {
        if(!this.getCar().getLock().isLock())
        {
            System.out.println("Водитель не может завести закрытую машину");
        }
        else if(!this.checkLicence(this.getCar().getLicenseCategory()))
        {
            System.out.println("У водителя нет прав нужной категории");
        }
        else if(!this.getCar().getEngine().isRunning())
        {
            System.out.println("Водитель завёл машину");
            this.getCar().start();
        }
        else
        {
            System.out.println("Водитель не может завести уже заведённую машину");
        }
    }

    @Override
    public void stopCar() {
        if(!this.getCar().getEngine().isRunning())
        {
            System.out.println("Водитель не может остановить незаведённую машину");
        }
        else
        {
            System.out.println("Водитель остановил машину");
            this.getCar().stop();
        }
    }

    @Override
    public void driveCar() {
        if(this.getCar().getEngine().isRunning())
        {
            this.getCar().drive();
        }
        else
        {
            System.out.println("Вначале заведите машину!!");
        }
    }

    @Override
    public void takePassenger(int countOfPassenger) {
        this.getCar().passengerSeatTake(countOfPassenger);
    }

    @Override
    public void removePassenger(int countOfPassenger) {
        this.getCar().passengerSeatLeave(countOfPassenger);
    }

    private boolean checkLicence(LicenseCategory licenseCategory)
    {
       for(LicenseCategory l: this.driverLicense)
       {
           if(l.equals(licenseCategory))
           {
               return true;
           }
       }
       return false;
    }

    @Override
    public void setFuelToTheCar(int newFuelCount, FuelType fuelType) {
        this.getCar().setFuel(newFuelCount, fuelType);
    }
}
