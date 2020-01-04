import computer.Computer;
import computerParts.CPU.CPU;
import computerParts.HDD.HDD;
import computerParts.api.*;
import computerParts.motherboard.Motherboard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // создаём массивы стандартов для запчастей
        ArrayList<IStandard> arrCPU = new ArrayList<>();
        arrCPU.add(StandardCPU.STANDARD_3);
        arrCPU.add(StandardCPU.STANDARD_1);

        ArrayList<IStandard> arrHDD = new ArrayList<>();
        arrHDD.add(StandardHDD.STANDARD1);
        arrHDD.add(StandardHDD.STANDARD4);

        ArrayList<IStandard> arrMotherboard = new ArrayList<>();
        arrMotherboard.add(StandardMotherboard.ST2);

        // создаём запчасти, которые хранят массив с их стандартами
        CPU cpu = new CPU(arrCPU);
        HDD hdd = new HDD(arrHDD);
        Motherboard motherboard = new Motherboard(arrMotherboard);

        // создаём массив запчастей
        ArrayList<ISpareParts> arrParts = new ArrayList<>();
        arrParts.add(cpu);
        arrParts.add(hdd);
        arrParts.add(motherboard);

        // создаём массив со стандартами компьютера
        ArrayList<IStandard> arrStandard = new ArrayList<>();
        arrStandard.add(StandardCPU.STANDARD_1);
        arrStandard.add(StandardCPU.STANDARD_2);
        arrStandard.add(StandardCPU.STANDARD_7);
        arrStandard.add(StandardHDD.STANDARD1);
        arrStandard.add(StandardHDD.STANDARD4);
        arrStandard.add(StandardMotherboard.ST2);
        arrStandard.add(StandardMotherboard.ST4);

        // создаём компьютер
        Computer comp = new Computer(arrParts, arrStandard);

        comp.start();
    }
}
