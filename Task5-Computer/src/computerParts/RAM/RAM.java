package computerParts.RAM;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class RAM extends ASpareParts {

    public RAM(ArrayList<IStandard> standard) {
        super(standard);
    }

    @Override
    public boolean checkStandard(ArrayList<IStandard> standard) {
        return false;
    }
}
