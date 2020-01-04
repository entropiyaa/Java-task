package computerParts.CPU;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;
import computerParts.api.StandardCPU;

import java.util.ArrayList;

public class CPU extends ASpareParts {

    public CPU(ArrayList<IStandard> standard) {
        super(standard);
    }

    public boolean checkStandard(ArrayList<IStandard> standard)
    {
        for (IStandard iStandard : standard)
        {
            if (iStandard.getClass() != StandardCPU.class) {
                System.out.println("В cpu находится недопустимый стандарт");
                return false;
            }
        }
        return true;
    }
}
