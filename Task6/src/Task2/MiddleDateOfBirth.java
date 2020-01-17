package Task2;

public class MiddleDateOfBirth extends DateOfBirth {

    @Override
    public void setDate(int date)
    {
        try {
            if(date < 0 || date > 31)
            {
                throw new MyException(date);
            }
            try {
                if(date < 13 || date > 18)
                {
                    throw new MyException2(date);
                }
                this.date = date;
                System.out.println("Число вашего рождения " + date);
            } catch (MyException2 e) {
                System.out.println("Неправильно ввели дату");
                e.checkParam2();
            }
        } catch (MyException e) {
            System.out.println("Неправильно ввели дату");
            e.checkParam();
        }
    }
}
