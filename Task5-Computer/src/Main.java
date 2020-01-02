import computer.Computer;
import computerParts.CPU.CPU;
import computerParts.HDD.HDD;
import computerParts.RAM.RAM;
import computerParts.api.ISpareParts;
import computerParts.api.Standard;
import computerParts.motherboard.Motherboard;
import computerParts.powerSupply.PowerSupply;
import computerParts.videoAdapter.VideoAdapter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CPU cpu = new CPU(Standard.STANDARD_1);
        System.out.println("Стандарт cpu: " + cpu.getStandard());

        HDD hdd = new HDD(Standard.STANDARD_2);
        System.out.println("Стандарт hdd: " + hdd.getStandard());

        Motherboard motherboard = new Motherboard(Standard.STANDARD_3);
        PowerSupply powerSupply = new PowerSupply(Standard.STANDARD_4);
        RAM ram = new RAM(Standard.STANDARD_5);
        VideoAdapter videoAdapter = new VideoAdapter(Standard.STANDARD_6);

        ArrayList<ISpareParts> arr = new ArrayList<>();
        arr.add(hdd);
        arr.add(cpu);
        arr.add(motherboard);
        arr.add(videoAdapter);
        arr.add(ram);
        arr.add(powerSupply);

        Computer comp = new Computer(arr, Standard.STANDARD_1, Standard.STANDARD_2, Standard.STANDARD_3,
                                     Standard.STANDARD_4, Standard.STANDARD_5, Standard.STANDARD_6);
        System.out.println("У компьютера должно быть cpu: " + comp.getStandardCPU());
        System.out.println("У компьютера должно быть hdd: " + comp.getStandardHDD());
        System.out.println("У компьютера должно быть мп: " + comp.getStandardMotherboard());
        comp.start();

    }
}
