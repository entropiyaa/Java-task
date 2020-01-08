package computerParts.api;

public enum StandardPowerSupply implements IStandard {

    STANDARD_1,
    STANDARD_2,
    STANDARD_3,
    STANDARD_4,
    STANDARD_5,
    STANDARD_6,
    STANDARD_7,
    STANDARD_8,
    STANDARD_9,
    STANDARD_10;

    @Override
    public String getStandardName()
    {
        return "PowerSupply";
    }
}
