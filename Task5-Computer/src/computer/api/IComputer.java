package computer.api;

import computerParts.api.ISpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public interface IComputer {
    void setArrayOfParts(ArrayList<ISpareParts> arrayOfParts);
    void setArrayOfStandard(ArrayList<IStandard> arrayOfStandard);
    void start();
}