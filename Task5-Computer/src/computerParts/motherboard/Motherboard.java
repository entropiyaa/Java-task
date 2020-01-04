package computerParts.motherboard;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;
import computerParts.api.StandardMotherboard;

import java.util.ArrayList;

public class Motherboard extends ASpareParts {

    public Motherboard(ArrayList<IStandard> standard) {
        super(standard);
    }

    @Override
    public boolean checkStandard(ArrayList<IStandard> standard)
    {
        for (IStandard iStandard : standard)
        {
            if (iStandard.getClass() != StandardMotherboard.class) {
                System.out.println("В motherboard находится недопустимый стандарт");
                return false;
            }
        }
        return true;
    }
}
