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

    public  ACars(String model, int numberOfSeats, LicenseCategory licenseCategory, IEngine engine, IWheel wheel, ILock lock)
    {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.licenseCategory = licenseCategory;
        this.engine = engine;
        this.wheel = wheel;
        this.lock = lock;
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

    @Override
    public void drive() {
        System.out.println("Поехал");
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
    public void fuel() {
        System.out.println("Заправляем");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем шины");
    }

    @Override
    public void driverSeat() {
        System.out.println("Садим водителя");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Садим пассажира");
    }
}