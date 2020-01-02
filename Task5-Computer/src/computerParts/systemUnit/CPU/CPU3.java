package computerParts.systemUnit.CPU;

import computer.api.CompCPU;
import computerParts.systemUnit.CPU.api.CPU;

public class CPU3 extends CPU {
    private CompCPU standard = CompCPU.CPU3;
    public CPU3() { }

    @Override
    public CompCPU getStandard() {
        return standard;
    }
}
