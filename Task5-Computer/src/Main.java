import computer.Computer1;
import computer.Computer2;
import computerParts.systemUnit.CPU.CPU1;
import computerParts.systemUnit.CPU.CPU2;
import computerParts.systemUnit.CPU.CPU3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        CPU1 cpu1 = new CPU1();
        CPU2 cpu2 = new CPU2();
        CPU3 cpu3 = new CPU3();


        Computer1 comp1 = new Computer1(cpu1);
        System.out.println(comp1.getCompCPU());
        System.out.println(cpu1.getStandard());

        Computer2 comp2 = new Computer2(cpu2);
        System.out.println(comp2.getCompCPU());
        System.out.println(cpu2.getStandard());

        comp1.start();
        comp2.start();

    }
}
