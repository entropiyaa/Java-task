package computerParts.api;

import java.util.ArrayList;

public abstract class ASpareParts implements ISpareParts {

    private ArrayList<IStandard> standard;
    private boolean defect;

    public ASpareParts(ArrayList<IStandard> standard)
    {
        this.standard = standard;
        defect = true;
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

}
