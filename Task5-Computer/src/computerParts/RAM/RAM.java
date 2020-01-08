package computerParts.RAM;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class RAM extends ASpareParts {

    public RAM(ArrayList<IStandard> standard) {
        super(standard);
        setPartName("RAM");
        if(!check(standard))
        {
            throw new IllegalArgumentException("В RAM находится недопустимый стандарт!");
        }
    }

}
