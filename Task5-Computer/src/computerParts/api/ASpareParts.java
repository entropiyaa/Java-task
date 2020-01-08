package computerParts.api;

import java.util.ArrayList;

public abstract class ASpareParts implements ISpareParts {

    private ArrayList<IStandard> standard;
    private boolean defect;
    private String partName;

    public ASpareParts(ArrayList<IStandard> standard)
    {
        this.standard = standard;
        defect = true;
    }

    @Override
    public String getPartName()
    {
        return partName;
    }

    @Override
    public void setPartName(String partName)
    {
        this.partName = partName;
    }

    @Override
    public ArrayList<IStandard> getStandard() {
        return standard;
    }

    @Override
    public boolean getDefect() {
        return defect;
    }

    @Override
    public void changeDefect() {
        defect = !defect;
    }

    @Override
    public boolean test(ArrayList<IStandard> arrayOfStandard)
    {
        for (IStandard partStandard : standard) {
            for (IStandard compStandard : arrayOfStandard) {
                if (partStandard == compStandard) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean check(ArrayList<IStandard> standard)
    {
        for (IStandard iStandard : standard)
        {
            if (!(iStandard.getStandardName().equals(partName))) {
                return false;
            }
        }
        return true;
    }
}
