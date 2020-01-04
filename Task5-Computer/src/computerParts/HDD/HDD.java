package computerParts.HDD;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;
import computerParts.api.StandardHDD;

import java.util.ArrayList;

public class HDD extends ASpareParts {

    public HDD(ArrayList<IStandard> standard) {
        super(standard);
    }

    @Override
    public boolean checkStandard(ArrayList<IStandard> standard)
    {
        for (IStandard iStandard : standard)
        {
            if (iStandard.getClass() != StandardHDD.class) {
                System.out.println("В hdd находится недопустимый стандарт");
                return false;
            }
        }
        return true;
    }
}
