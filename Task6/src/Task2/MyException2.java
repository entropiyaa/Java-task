package Task2;

public class MyException2 extends MyException {

    public MyException2(int param)
    {
        super(param);
    }

    public void checkParam2()
    {
        if(this.getParam() < 13)
        {
            System.out.println("Дата вашего рождения находится в начале месяца");
        }
        if(this.getParam() > 18)
        {
            System.out.println("Дата вашего рождения находится в конце месяца");
        }
    }
}
