package computerParts.api;

public class ASpareParts implements ISpareParts {

    private Standard standard;

    public ASpareParts(Standard standard)
    {
        this.standard = standard;
    }

    @Override
    public Standard getStandard() {
        return standard;
    }
}
