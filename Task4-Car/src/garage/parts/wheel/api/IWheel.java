package garage.parts.wheel.api;

public interface IWheel {
    int getRadius();
    Seasonality getSeasonality();
    String getId();
    void setSeasonality(Seasonality seasonality, int radius);
}
