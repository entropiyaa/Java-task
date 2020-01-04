package computerParts.powerSupply;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class PowerSupply extends ASpareParts {

    public PowerSupply(ArrayList<IStandard> standard) {
        super(standard);
    }

    @Override
    public boolean checkStandard(ArrayList<IStandard> standard) {
        return false;
    }
}
