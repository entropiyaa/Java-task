package computer;

import computer.api.IComputer;
import computerParts.CPU.CPU;
import computerParts.HDD.HDD;
import computerParts.RAM.RAM;
import computerParts.api.ISpareParts;
import computerParts.api.Standard;
import computerParts.motherboard.Motherboard;
import computerParts.powerSupply.PowerSupply;
import computerParts.videoAdapter.VideoAdapter;

import java.util.ArrayList;

public class Computer implements IComputer {

    private ArrayList<ISpareParts> arrayOfParts;
    private Standard standardCPU;
    private Standard standardHDD;
    private Standard standardMotherboard;
    private Standard standardPowerSupply;
    private Standard standardRAM;
    private Standard standardVideoAdapter;

    public Computer(ArrayList<ISpareParts> arrayOfParts, Standard standardCPU, Standard standardHDD,
                    Standard standardMotherboard, Standard standardPowerSupply, Standard standardRAM,
                    Standard standardVideoAdapter)
    {
        this.arrayOfParts = arrayOfParts;
        this.standardCPU = standardCPU;
        this.standardHDD = standardHDD;
        this.standardMotherboard = standardMotherboard;
        this.standardPowerSupply = standardPowerSupply;
        this.standardRAM = standardRAM;
        this.standardVideoAdapter = standardVideoAdapter;
    }

    public Standard getStandardCPU()
    {
        return standardCPU;
    }

    public Standard getStandardHDD()
    {
        return standardHDD;
    }

    public Standard getStandardMotherboard()
    {
        return standardMotherboard;
    }

    @Override
    public void start() {
        for(ISpareParts arrayOfPart : arrayOfParts)
        {
            if(arrayOfPart.getDefect())
            {
                if (arrayOfPart.getClass() == CPU.class)
                {
                    if (standardCPU != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт CPU");
                        break;
                    }
                    else
                        System.out.println("CPU подошёл");
                }
                else if (arrayOfPart.getClass() == HDD.class)
                {
                    if (standardHDD != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт HDD");
                        break;
                    }
                    else
                        System.out.println("HDD подошёл");
                }
                else if(arrayOfPart.getClass() == Motherboard.class)
                {
                    if(standardMotherboard != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт материнской платы");
                        break;
                    }
                    else
                        System.out.println("Материнская плата подошла");
                }
                else if(arrayOfPart.getClass() == PowerSupply.class)
                {
                    if(standardPowerSupply != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт блока питания");
                        break;
                    }
                    else
                        System.out.println("Блок питания подошёл");
                }
                else if(arrayOfPart.getClass() == RAM.class)
                {
                    if(standardRAM != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт RAM");
                        break;
                    }
                    else
                        System.out.println("RAM подошёл");
                }
                else if(arrayOfPart.getClass() == VideoAdapter.class)
                {
                    if(standardVideoAdapter != arrayOfPart.getStandard())
                    {
                        System.out.println("Не подходит стандарт видеоадаптера");
                        break;
                    }
                    else
                        System.out.println("Видеоадаптер подошёл");
                }
            }
            else
            {
                System.out.println("Не может запуститься, есть бракованная деталь");
                break;
            }
        }
    }
}
