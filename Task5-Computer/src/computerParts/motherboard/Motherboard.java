package computerParts.motherboard;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class Motherboard extends ASpareParts {

    public Motherboard(ArrayList<IStandard> standard) {
        super(standard);
        setPartName("Motherboard");
        if(!check(standard))
        {
            throw new IllegalArgumentException("В motherboard находится недопустимый стандарт!");
        }
    }
}
