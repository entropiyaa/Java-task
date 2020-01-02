package computerParts.systemUnit.CPU;

import computer.api.CompCPU;
import computerParts.systemUnit.CPU.api.CPU;

public class CPU1 extends CPU {
    private CompCPU standard = CompCPU.CPU1;
    public CPU1() { }

    @Override
    public CompCPU getStandard() {
        return standard;
    }
}
