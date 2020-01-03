package computerParts.api;

public class ASpareParts implements ISpareParts {

    private Standard standard;
    private boolean defect;

    public ASpareParts(Standard standard)
    {
        this.standard = standard;
        defect = true;
    }

    @Override
    public Standard getStandard() {
        return standard;
    }

    @Override
    public void changeDefect() {
        defect = !defect;
    }

    @Override
    public boolean getDefect() {
        return defect;
    }
}
