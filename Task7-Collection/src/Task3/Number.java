package Task3;

public class Number implements Comparable<Number> {

    private int number;

    public Number(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    @Override
    public int compareTo(Number o) {
        return Integer.compare(this.number, o.getNumber());
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
