package computerParts.CPU;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class CPU extends ASpareParts {

    public CPU(ArrayList<IStandard> standard) {
        super(standard);
        setPartName("CPU");
        if(!check(standard))
        {
            throw new IllegalArgumentException("В cpu находится недопустимый стандарт!");
        }
    }
}