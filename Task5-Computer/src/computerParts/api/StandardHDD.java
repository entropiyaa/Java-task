package computerParts.api;

public enum StandardHDD implements IStandard {

    STANDARD1,
    STANDARD2,
    STANDARD3,
    STANDARD4;

    @Override
    public String getStandardName() {
        return "HDD";
    }
}
