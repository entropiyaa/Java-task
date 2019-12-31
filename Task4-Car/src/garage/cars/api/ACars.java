package garage.cars.api;

import garage.parts.engine.api.FuelType;
import garage.parts.key.api.IKey;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public abstract class ACars implements ICar {
    private final int numberOfSeatsFinal;
    private int numberOfSeats;
    private LicenseCategory licenseCategory;
    private IEngine engine;
    private IWheel wheel;
    private String model;
    private ILock lock;
    private int fuel;

    public  ACars(String model, int numberOfSeatsFinal, LicenseCategory licenseCategory, IEngine engine, IWheel wheel,
                  ILock lock, int fuel)
    {
        this.model = model;
        this.numberOfSeatsFinal = numberOfSeatsFinal;
        this.licenseCategory = licenseCategory;
        this.engine = engine;
        this.wheel = wheel;
        this.lock = lock;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeatsFinal;
    }

    @Override
    public IEngine getEngine()
    {
        return engine;
    }

    @Override
    public IWheel getWheel()
    {
        return wheel;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public LicenseCategory getLicenseCategory() {
        return licenseCategory;
    }

    @Override
    public ILock getLock() {
        return lock;
    }

    @Override // используем топливо
    public void drive() {
        if(this.getFuel() > 0)  // если у нас есть топливо
        {
            System.out.println("Машина едет");
            this.useFuel(this.getEngine().running());
        }
        else
        {
            System.out.println("Не хватает топлива");
        }
    }

    @Override
    public void open(IKey key) {
        if(this.getLock().checkKey(key))
        {
            this.getLock().openLock();
            this.driverSeatTake();
        }
        else
        {
            System.out.println("Не подходит ключ");
        }
    }

    @Override
    public void close(IKey key) {
        if(this.getLock().checkKey(key))
        {
            this.getLock().closeLock();
            this.driverSeatLeave();
        }
        else
        {
            System.out.println("Не подходит ключ");
        }
    }

    @Override
    public void start() {
        System.out.println("Запустили");
        this.getEngine().start();
    }

    @Override
    public void stop() {
        System.out.println("Остановлено");
        this.getEngine().stop();
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int newFuel, FuelType fuelType) {
        if (this.getEngine().getFuelType() == fuelType)
        {
            fuel += newFuel;
        }
        else
        {
            System.out.println("Вы заливаете не тот тип топлива");
        }
    }

    @Override
    public void useFuel(int usefulFuel) {
        fuel -= usefulFuel;
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем шины");
    }

    @Override
    public void driverSeatTake() {
        numberOfSeats -= 1;
        System.out.println("Водитель сел в машину");
    }

    @Override
    public void driverSeatLeave() {
        numberOfSeats += 1;
        System.out.println("Водитель вышел из машины");
    }

    @Override
    public void passengerSeatTake(int countOfPassenger) {
        if(numberOfSeats >= countOfPassenger)
        {
            numberOfSeats -= countOfPassenger;
            System.out.println("Садим " + countOfPassenger + " пассажира(ов)");
        }
        else
        {
            System.out.println("Хватит место только на " +  numberOfSeats + " пассажира(ов)");
        }
    }

    @Override
    public void passengerSeatLeave(int countOfPassenger) {
        if(numberOfSeatsFinal - numberOfSeats <= countOfPassenger)
        {
            System.out.println("Вы хотите высадить больше пассажиров, чем там есть");
        }
        else
        {
            numberOfSeats += countOfPassenger;
            System.out.println("Высаживаем " + countOfPassenger + " пассажира(ов)");
        }
    }
}