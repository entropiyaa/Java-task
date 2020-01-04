package computer;

import computer.api.IComputer;
import computerParts.CPU.CPU;
import computerParts.HDD.HDD;
import computerParts.api.ISpareParts;
import computerParts.api.IStandard;
import computerParts.motherboard.Motherboard;

import java.util.ArrayList;

public class Computer implements IComputer {

    private ArrayList<ISpareParts> arrayOfParts;
    private ArrayList<IStandard> arrayOfStandard;

    public Computer(ArrayList<ISpareParts> arrayOfParts, ArrayList<IStandard> arrayOfStandard)
    {
        this.arrayOfParts = arrayOfParts;
        this.arrayOfStandard = arrayOfStandard;
    }

    @Override
    public void start() {
        for(ISpareParts part : arrayOfParts)
        {
            if (part.getClass() == CPU.class)
            {
                if(part.checkStandard(part.getStandard()))
                {
                    if(part.test(arrayOfStandard))
                    {
                        System.out.println("CPU подошёл");
                    }
                    else
                    {
                        System.out.println("Стандарт CPU не подходит");
                    }
                }
            }
            else if (part.getClass() == HDD.class)
            {
                if(part.checkStandard(part.getStandard()))
                {
                    if(part.test(arrayOfStandard))
                    {
                        System.out.println("HDD подошёл");
                    }
                    else
                    {
                        System.out.println("Стандарт HDD не подходит");
                    }
                }
            }
            else if(part.getClass() == Motherboard.class)
            {
                if(part.checkStandard(part.getStandard()))
                {
                    if(part.test(arrayOfStandard))
                    {
                        System.out.println("Motherboard подошёл");
                    }
                    else
                    {
                        System.out.println("Стандарт Motherboard не подходит");
                    }
                }
            }
        }
        for(ISpareParts part : arrayOfParts)
        {
            if(!part.getDefect())
            {
                System.out.println("Есть бракованная деталь!!");
            }
        }
    }
}
