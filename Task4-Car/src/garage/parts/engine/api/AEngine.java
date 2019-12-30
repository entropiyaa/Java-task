package garage.parts.engine.api;

import java.util.Random;

public abstract class AEngine implements IEngine {

    private final String id;
    private final int capacity;
    protected FuelType fuelType;
    private boolean running;

    public AEngine(String id, int capacity, FuelType fuelType)
    {
        this.id = id;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public boolean start() {
        if(!running) {
            running = true;
        } else {
            throw new IllegalArgumentException("Не могу завесту уже заведенный мотор");
        }
        return running;
    }

    @Override
    public boolean stop() {
        if(running) {
            running = false;
        } else {
            throw new IllegalArgumentException("Не могу остановить уже остановленный мотор");
        }
        return running;
    }

    @Override // просто генерируем количество топлива
    public int running() {
        Random random = new Random();
        if(running) {
             return random.nextInt(10);
        }
        return 0;
    }
}
