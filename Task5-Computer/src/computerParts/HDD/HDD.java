package computerParts.HDD;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class HDD extends ASpareParts {

    public HDD(ArrayList<IStandard> standard) {
        super(standard);
        setPartName("HDD");
        if(!check(standard))
        {
            throw new IllegalArgumentException("В hdd находится недопустимый стандарт!");
        }
    }
}