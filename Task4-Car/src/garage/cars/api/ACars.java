package garage.cars.api;

import garage.parts.key.api.IKey;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public abstract class ACars implements ICar {
    private int numberOfSeats;
    private LicenseCategory licenseCategory;
    private IEngine engine;
    private IWheel wheel;
    private String model;
    private ILock lock;
    private int fuel;

    public  ACars(String model, int numberOfSeats, LicenseCategory licenseCategory, IEngine engine, IWheel wheel,
                  ILock lock, int fuel)
    {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.licenseCategory = licenseCategory;
        this.engine = engine;
        this.wheel = wheel;
        this.lock = lock;
        this.fuel = fuel;
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
        System.out.println("Открыто");
    }

    @Override
    public void close() {
        System.out.println("Закрыто");
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
    public void setFuel(int newFuel) {
        fuel += newFuel;
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
    public void driverSeat() {
        numberOfSeats -= 1;
        System.out.println("Водитель сел в машину");
    }

    @Override
    public void passengerSeat(int countOfPassenger) {
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
}