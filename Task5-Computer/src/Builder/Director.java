package Builder;

import computer.Computer;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder)
    {
        this.builder = builder;
    }

    public Computer buildComputer()
    {
        builder.buildArrayOfParts();
        builder.buildArrayOfStandard();
        return builder.getComputer();
    }
}
