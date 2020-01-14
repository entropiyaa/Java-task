package Builder;

import computer.Computer;

public abstract class Builder {

    private Computer computer;

    Builder()
    {
        computer = new Computer();
    }

    public abstract void buildArrayOfParts();
    public abstract void buildArrayOfStandard();

    public Computer getComputer()
    {
        return computer;
    }
}
