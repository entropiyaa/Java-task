package garage.parts.engine.api;

public interface IEngine {
    String getId();
    FuelType getFuelType();
    int getCapacity();
    boolean isRunning();
    boolean start();
    boolean stop();
    double running();
}
