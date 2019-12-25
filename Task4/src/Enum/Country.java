package Enum;

public enum Country implements ICountry {

    BELARUS(20_759,9_475_174),
    RUSSIA(17_125_191,146_780_720),
    ENGLAND(130_395,53_012_456),
    UKRAINE(603_549,48_240_902),
    SPAIN(504_782,46_528_966),
    GREECE(131_957,10_834_862),
    ESTONIA(45_215,1_123_734),
    NORWAY(385_203,5_265_158),
    LATVIA(64_589,1_934_379),
    CHINA(9_597_000,1_397_730_000);

    private int area;
    private int population;

    Country(int area, int population)
    {
        this.area = area;
        this.population = population;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return super.toString() + " площадь " + area + " население " + population;
    }

    public void compareTwoCountry(Country c)
    {
        if(this.area == c.area)
        {
            System.out.println("Площади двух стран равны");
        }
        if(this.area > c.area)
        {
            System.out.println("Площадь " + this.name() + " больше чем площадь " + c.name());
        }
        else
        {
            System.out.println("Площадь " + this.name() + " меньше чем площадь " + c.name());
        }
    }
}
