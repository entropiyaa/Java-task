package computer;

import computer.api.CompCPU;
import computer.api.Computer;
import computerParts.systemUnit.CPU.api.CPU;

import java.util.EnumSet;
import java.util.Set;

public class Computer1 extends Computer {

    private Set<CompCPU> compCPU = EnumSet.allOf(CompCPU.class);

    public Computer1(CPU cpu) {
        super(cpu);
    }

    public Set<CompCPU> getCompCPU()
    {
        return compCPU;
    }

    @Override
    public void start() {
        if(!compCPU.contains(this.getCpu().getStandard()))
        {
            System.out.println("Не подходит стандарт CPU");
        }
        else
        {
            System.out.println("Запустился");
        }
    }
}
