package driver;

import driver.api.IDriver;
import garage.cars.api.ICar;
import garage.cars.api.LicenseCategory;
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
        } else if(this.getKey().isKey()) {
            System.out.println("Водитель открыл замок ключём");
            this.getKey().useKey();
            this.getCar().getLock().openLock();
            this.getInACar(); // водитель сел в машину
        } else {
            System.out.println("Ключ не подходит");
        }
    }

    @Override
    public void closeCar(IKey key) {
        if(!this.getCar().getLock().isLock()) {
            System.out.println("Водитель не может закрыть ключом уже закрытую машину!!");
        } else if(this.getKey().isKey()) {
            System.out.println("Водитель закрыл замок ключём");
            this.getKey().useKey();
            this.getCar().getLock().closeLock();
        } else {
            System.out.println("Ключ не подходит");
        }
    }

    @Override
    public void startCar() {
        if(!this.getCar().getLock().isLock())
        {
            System.out.println("Водитель не может завести закрытую машину");
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
        this.getCar().passengerSeat(countOfPassenger);
    }

    @Override
    public void getInACar() {
        this.getCar().driverSeat();
    }

/*    public boolean checkLicence(ArrayList<LicenseCategory> driverLicense1)
    {

    }*/

}
