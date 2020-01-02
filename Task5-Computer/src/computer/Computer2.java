package computer;

import computer.api.CompCPU2;
import computer.api.Computer;
import computerParts.systemUnit.CPU.api.CPU;

import java.util.EnumSet;
import java.util.Set;

public class Computer2 extends Computer {

    private Set<CompCPU2> compCPU = EnumSet.allOf(CompCPU2.class);

    public Computer2(CPU cpu) {
        super(cpu);
    }

    public Set<CompCPU2> getCompCPU()
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
