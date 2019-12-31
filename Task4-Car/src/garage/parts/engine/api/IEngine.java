package garage.parts.engine.api;

public interface IEngine {
    String getId();
    FuelType getFuelType();
    boolean isRunning();
    boolean start();
    boolean stop();
    int running();
}
