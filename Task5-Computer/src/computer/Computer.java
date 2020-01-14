package computer;

import computer.api.IComputer;
import computerParts.api.ISpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class Computer implements IComputer {

    private ArrayList<ISpareParts> arrayOfParts;
    private ArrayList<IStandard> arrayOfStandard;

    public Computer() {}

    public Computer(ArrayList<ISpareParts> arrayOfParts, ArrayList<IStandard> arrayOfStandard)
    {
        this.arrayOfParts = arrayOfParts;
        this.arrayOfStandard = arrayOfStandard;
    }


    @Override
    public void setArrayOfParts(ArrayList<ISpareParts> arrayOfParts) {
        this.arrayOfParts = arrayOfParts;
    }

    @Override
    public void setArrayOfStandard(ArrayList<IStandard> arrayOfStandard) {
        this.arrayOfStandard = arrayOfStandard;
    }

    @Override
    public void start() {
        for(ISpareParts part : arrayOfParts)
        {
            if(part.test(arrayOfStandard))
            {
                System.out.println(part.getPartName() + " подошёл");
            }
            else
            {
                System.out.println("Стандарт " + part.getPartName() + " не подходит");
                break;
            }
        }
        for(ISpareParts part : arrayOfParts)
        {
            if(!part.getDefect())
            {
                System.out.println(part.getPartName() + " бракованная деталь!!");
            }
        }
    }
}