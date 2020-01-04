package computerParts.api;

public enum StandardHDD implements IStandard {

    STANDARD1,
    STANDARD2,
    STANDARD3,
    STANDARD4;

    @Override
    public StandardHDD[] getStandard() {
        return StandardHDD.values();
    }
}
