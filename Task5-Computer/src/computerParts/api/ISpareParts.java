package computerParts.api;

import java.util.ArrayList;

public interface ISpareParts {
    ArrayList<IStandard> getStandard();
    boolean test(ArrayList<IStandard> arrayOfStandard);
    boolean getDefect();
    void changeDefect();
    boolean checkStandard(ArrayList<IStandard> standard);
}
