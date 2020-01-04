package computerParts.api;

public enum StandardMotherboard implements IStandard {

    ST1,
    ST2,
    ST3,
    ST4;

    @Override
    public StandardMotherboard[] getStandard() {
        return StandardMotherboard.values();
    }
}
