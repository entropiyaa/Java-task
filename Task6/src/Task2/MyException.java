package Task2;

public class MyException extends Exception {

    private int param;

    public MyException(int param)
    {
        this.param = param;
    }

    public int getParam()
    {
        return param;
    }

    public void checkParam()
    {
        if(param < 0)
        {
            System.out.println("Дата не может быть отрицательной");
        }
        if(param > 31)
        {
            System.out.println("Дата не может быть больше 31");
        }
    }
}
