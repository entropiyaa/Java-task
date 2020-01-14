package Builder;

import computerParts.CPU.CPU;
import computerParts.HDD.HDD;
import computerParts.RAM.RAM;
import computerParts.api.*;
import computerParts.motherboard.Motherboard;
import computerParts.powerSupply.PowerSupply;
import computerParts.videoAdapter.VideoAdapter;

import java.util.ArrayList;

public class ComputerBuilder1 extends Builder {

    @Override
    public void buildArrayOfParts() {
        // создаём массивы стандартов для запчастей
        ArrayList<IStandard> arrCPU = new ArrayList<>();
        arrCPU.add(StandardCPU.STANDARD_3);
        arrCPU.add(StandardCPU.STANDARD_1);

        ArrayList<IStandard> arrHDD = new ArrayList<>();
        arrHDD.add(StandardHDD.STANDARD2);
        arrHDD.add(StandardHDD.STANDARD4);

        ArrayList<IStandard> arrMotherboard = new ArrayList<>();
        arrMotherboard.add(StandardMotherboard.ST2);

        ArrayList<IStandard> arrPowerSupply = new ArrayList<>();
        arrPowerSupply.add(StandardPowerSupply.STANDARD_4);
        arrPowerSupply.add(StandardPowerSupply.STANDARD_5);

        ArrayList<IStandard> arrRAM = new ArrayList<>();
        arrRAM.add(StandardRAM.STANDARD_6);
        arrRAM.add(StandardRAM.STANDARD_7);

        ArrayList<IStandard> arrVideoAdapter = new ArrayList<>();
        arrVideoAdapter.add(StandardVideoAdapter.STANDARD_8);
        arrVideoAdapter.add(StandardVideoAdapter.STANDARD_9);

        // создаём запчасти, которые хранят массив с их стандартами
        CPU cpu = new CPU(arrCPU);
        HDD hdd = new HDD(arrHDD);
        Motherboard motherboard = new Motherboard(arrMotherboard);
        PowerSupply powerSupply = new PowerSupply(arrPowerSupply);
        RAM ram = new RAM(arrRAM);
        VideoAdapter videoAdapter = new VideoAdapter(arrVideoAdapter);

        // создаём массив запчастей
        ArrayList<ISpareParts> arrParts = new ArrayList<>();
        arrParts.add(cpu);
        arrParts.add(hdd);
        arrParts.add(motherboard);
        arrParts.add(powerSupply);
        arrParts.add(ram);
        arrParts.add(videoAdapter);

        getComputer().setArrayOfParts(arrParts);
    }

    @Override
    public void buildArrayOfStandard() {

        // создаём массив со стандартами компьютера
        ArrayList<IStandard> arrStandard = new ArrayList<>();
        arrStandard.add(StandardCPU.STANDARD_1);
        arrStandard.add(StandardCPU.STANDARD_2);
        arrStandard.add(StandardCPU.STANDARD_7);
        arrStandard.add(StandardHDD.STANDARD1);
        arrStandard.add(StandardHDD.STANDARD4);
        arrStandard.add(StandardMotherboard.ST2);
        arrStandard.add(StandardMotherboard.ST4);
        arrStandard.add(StandardPowerSupply.STANDARD_4);
        arrStandard.add(StandardRAM.STANDARD_7);
        arrStandard.add(StandardVideoAdapter.STANDARD_9);

        getComputer().setArrayOfStandard(arrStandard);
    }
}
