package computerParts.systemUnit.CPU;

import computer.api.CompCPU;
import computerParts.systemUnit.CPU.api.CPU;

public class CPU2 extends CPU {
    private CompCPU standard = CompCPU.CPU2;
    public CPU2() { }

    @Override
    public CompCPU getStandard() {
        return standard;
    }
}
