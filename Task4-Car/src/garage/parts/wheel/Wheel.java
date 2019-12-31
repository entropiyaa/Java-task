package garage.parts.wheel;

import garage.parts.wheel.api.IWheel;
import garage.parts.wheel.api.Seasonality;

public class Wheel implements IWheel {
    private int radius;
    private Seasonality seasonality;
    private final String id;

    public Wheel(int radius, Seasonality seasonality, String id)
    {
        this.radius = radius;
        this.seasonality = seasonality;
        this.id = id;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public Seasonality getSeasonality() {
        return seasonality;
    }

    @Override
    public String  getId() {
        return id;
    }

    @Override
    public void setSeasonality(Seasonality seasonality, int radius) {
        if (this.radius == radius)
        {
            this.seasonality = seasonality;
            System.out.println("Поменяли шины");
        }
        else
        {
            System.out.println("Шины не подходят по размеру");
        }
    }
}
