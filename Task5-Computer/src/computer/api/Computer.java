package computer.api;

// конструктор(запчасти), один метод(запуск)

import computerParts.systemUnit.CPU.api.ICPU;

import java.util.EnumSet;
import java.util.Set;

public abstract class Computer implements IComputer {

    private ICPU cpu;

    public Computer(ICPU cpu)
    {
        this.cpu = cpu;
    }

    public ICPU getCpu()
    {
        return cpu;
    }

    @Override
    public void start() {
    }
}